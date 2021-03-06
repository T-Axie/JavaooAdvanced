package bstorm.akimts.oo.avance.exo;

import bstorm.akimts.oo.avance.exo.exceptions.EtatCompetitionException;
import bstorm.akimts.oo.avance.exo.exceptions.LimiteAtteinteException;
import bstorm.akimts.oo.avance.exo.sportifs.Sportif;

import java.util.*;

public class CompetitionImpl<T extends Sportif> implements Competition<T> {
    
    private final int limiteParticipant;
    private final Map<T, Integer> participants = new HashMap<>();
    private List<T> classements;

    public CompetitionImpl() {
        limiteParticipant = 0;
    }


    public CompetitionImpl(int limiteParticipant) {
        if(limiteParticipant < 0)
            throw new IllegalArgumentException("la limite de participant invalide (devrait être positive");
        this.limiteParticipant = limiteParticipant;
    }

    @Override
    public void lancer() {

        // n'est pas terminé
        if( isTerminee()  )
            throw new EtatCompetitionException(isTerminee() , false);

        // Pas de participants
        if( participants.size() <= 3 )
            throw new IllegalStateException("La compet n'a pas de participants");

        for (T T : participants.keySet()) {
            participants.put(T, T.performer());
        }

        classements = genererClassement();
    }

    @Override
    public void inscrire(T aInscrire) {

        // n'est pas termine
        if( isTerminee()  )
            throw new EtatCompetitionException(isTerminee() , false);

        // il y a de la place
        if( limiteParticipant != 0 && participants.size() >= limiteParticipant )
            throw new LimiteAtteinteException(limiteParticipant);

        // doit etre non inscrit+
        if( participants.containsKey(aInscrire) )
            throw new IllegalArgumentException("T déjà inscrit");

        participants.put(aInscrire, null);
    }

    @Override
    public void desinscrire(T T) {

        // deja terminée
        if( isTerminee()  )
            throw new EtatCompetitionException(isTerminee() , false);

        // n'existe pas
        if( !participants.containsKey(T) )
            throw new IllegalArgumentException("T non inscrit");

        participants.remove(T);
    }

    @Override
    public Set<T> getGagnants() {

        if( !isTerminee() )
            throw new EtatCompetitionException(isTerminee() , true);

        Collection<Integer> values = participants.values();
        int maxPerf = 0;
        for (Integer value : values) {
            if( value > maxPerf )
                maxPerf = value;
        }

        Set<T> gagnants = new HashSet<>();
        for (Map.Entry<T, Integer> entry : participants.entrySet()) {
            if( entry.getValue() == maxPerf )
                gagnants.add(entry.getKey() );
        }

    //        int maxPerf = participants.values()
    //                .stream()
    //                .mapToInt(i -> i)
    //                .max()
    //                .getAsInt();

    //        Set<T> gagnants = participants.entrySet().stream()
    //                .filter( e -> e.getValue() == maxPerf )
    //                .map( Map.Entry::getKey )
    //                .collect(Collectors.toSet());

        return gagnants;
    }

    @Override
    public boolean isTerminee() {
        return classements != null;
    }

    @Override
    public int getLimiteParticipant() {
        return limiteParticipant;
    }

    private List<T> genererClassement(){

        List<T> classement = new ArrayList<>();
        Set<T> set = participants.keySet();
        for (T T : set) {

            boolean place = false;
            for (int i = 0;!place && i < classement.size() ; i++) {

                T currentT = classement.get(i);
                int currentPerf = participants.get(currentT);

                int perfSportAPlacer = participants.get(T);

                if( perfSportAPlacer > currentPerf ){
                    classement.add(i, T);
                    place = true;
                }
            }

            if( !place )
                classement.add(T);

        }

        return classement;
    }

    public List<T> getClassements() {
        return new ArrayList<>(classements);
    }

    public void inscrire(Collection<? extends T> aInscrire){
        for (T sportif : aInscrire) {
            inscrire(sportif);
        }
    }

    public void transfertParticipants(CompetitionImpl<? super T> autreCompet){
        autreCompet.inscrire( participants.keySet() );
    }
}


