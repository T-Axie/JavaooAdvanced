package com.example.demo.model;


import java.util.ArrayList;

public class Trial {
    private String name;
    private Circuit circuit;
    private int numberOfTurn;
    private final ArrayList<Participant> participants;

    public Trial(String name, Circuit circuit, int numberOfTurn) {
        this.name = name;
        this.circuit = circuit;
        this.numberOfTurn = numberOfTurn;
        this.participants = new ArrayList<>();
    }

    //region Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Circuit getCircuit() {
        return circuit;
    }

    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }

    public int getNumberOfTurn() {
        return numberOfTurn;
    }

    public void setNumberOfTurn(int numberOfTurn) {
        this.numberOfTurn = numberOfTurn;
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }
    //endregion

    public void addParticipant (Participant participant) {
     this.participants.add(participant);
    }

    private void makeTrial () {
        for (Participant element : this.participants) {
            element.makeTurn(circuit.getFullTurnKm());
        }
    }
    public void MakeFullTrial() {
        for (int i = 0; i < this.numberOfTurn; i++) {
            this.makeTrial();
        }
    }
    public Participant getWinner() {
        Participant winner = this.participants.get(0);
        for (int i = 1; i < this.participants.size(); i++) {
            if (this.participants.get(i).getFullTime() < winner.getFullTime()) {
                winner = this.participants(i);
            }
        }
    }
    public void ShowOneTurn () {
        for (Participant element : this.participants) {
            System.out.println(element.name +" finish this turn in" +element.timeList);
        }
    }
}                              