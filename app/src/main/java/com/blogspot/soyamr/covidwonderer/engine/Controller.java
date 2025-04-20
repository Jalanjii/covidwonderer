package com.blogspot.soyamr.covidwonderer.engine;

import com.blogspot.soyamr.covidwonderer.elements.house.Room;

public interface Controller {
    void changeBackground(Room room);
    void hasReachedDoor(int x, int y);
    void moveToTheRight();
    void moveToTheLeft();
    boolean steppingOnRoomObject(int x, int y);
    void whereAmI(int x, int y);
    boolean reachedFloorEnd(int y);
    int getCurrentFloorY();

    void startPokimonGame();

    void startRaceGame();

    void startWangGame();
}
