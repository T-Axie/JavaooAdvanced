package com.example.demo.model;
import com.example.demo.exeption.*;

import java.util.*;

public class Competition {
    private final Integer limitParticipant;
    private final Map<Sportif, Integer> participant;
    private Boolean isFinish;

    public Competition(Integer limitParticipant) {
        if (limitParticipant < 0)
            throw  new IllegalArgumentException("Limite de participant invalide");
        this.limitParticipant = 0;
        this.isFinish = false;
        this.participant = new HashMap<>();
    }

//region Getter & Setter
    public Integer getLimitParticipant() {
        return limitParticipant;
    }

    public Map<Sportif, Integer> getParticipant() {
        return participant;
    }

    public Boolean getFinish() {
        return isFinish;
    }

    public void setFinish(Boolean finish) {
        isFinish = finish;
    }
//endregion

    public void subscribe (Sportif sportif) throws ParticipantLimitException {
        if (participant.size() >= limitParticipant && limitParticipant !=0) {
            throw new ParticipantLimitException();
        }
        if (isFinish) {
            throw new GameFinishException();
        }
        if (participant.containsKey(sportif)) {
            throw new IllegalArgumentException("Sportif déjà inscrit");
        }
        participant.put(sportif, null);

    }
    public void unSubcribe (Sportif sportif) {
        if (isFinish) {
            throw new GameFinishException();
        }
        if (!participant.containsKey(sportif)) {
            throw new IllegalArgumentException("Sportif non-inscrit");
        }
        participant.remove(sportif);
    }
    public void launchTheGame (Competition competition) {
        if (isFinish) {
            throw new IllegalStateException();
        }
        if (participant.size() <= 1)
            throw new IllegalStateException("Pas de participant");
        for (Sportif sportif: participant.keySet()
             ) {
            participant.put(sportif, sportif.getWinNumber());
        }
        isFinish = true;
    }

    public Set<Sportif> getWinner (Competition competition) {
        int maxPerf = 0;
        if (!isFinish)
            throw  new IllegalStateException("La partie n'est pas encore lancée...");

        Collection<Integer> values = participant.values();

        for (Integer value: values) {
            if (value > maxPerf)
                maxPerf = value;
        }
        Set<Sportif> winner = new HashSet<>();
        return null;
    }
}
