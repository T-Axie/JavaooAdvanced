package com.example.demo.model;
import com.example.demo.exeption.*;
import java.util.ArrayList;

public class Competition {
    Integer limitParticipant;
    ArrayList<Sportif> listParticipant;
    Boolean isFinish;

    public Competition(Integer limitParticipant) {
        this.limitParticipant = limitParticipant;
        this.listParticipant = new ArrayList<>();
        this.isFinish = false;
    }

    public Integer getLimitParticipant() {
        return limitParticipant;
    }

    public void setLimitParticipant(Integer limitParticipant) {
        this.limitParticipant = limitParticipant;
    }

    public ArrayList<Sportif> getListParticipant() {
        return listParticipant;
    }

    public void setListParticipant(ArrayList<Sportif> listParticipant) {
        this.listParticipant = listParticipant;
    }

    public Boolean getFinish() {
        return isFinish;
    }

    public void setFinish(Boolean finish) {
        isFinish = finish;
    }

    public void subscribe (Sportif sportif) {
        if (listParticipant.size() < limitParticipant) {
            throw new ParticipantLimitException();
        }
        if (isFinish) {
            throw new GameFinishException();
        }
        if (this.listParticipant.contains(sportif)) {
            throw new ParticipantDoubleException();
        }
        this.listParticipant.add(sportif);

    }
    public void unsubcribe (Sportif sportif) {
        if (isFinish) {
            throw new GameFinishException();
        }
        if (!this.listParticipant.contains(sportif)) {
            throw new NotSubscribeException();
        }
        if (this.listParticipant.contains(sportif)) {
            listParticipant.remove(sportif);
        }
    }
    public void launchTheGame (Competition competition) {
        if (this.isFinish) {
            throw new AlreadyFinishException();
        }
        for (Sportif sportif: competition.getListParticipant()
             ) {
            sportif.setWinNumber();
        }
        this.isFinish = true;
    }

    public String winner (Competition competition) {
        for (Sportif sportif: this.listParticipant
             ) {

        }
        return null;
    }

}
