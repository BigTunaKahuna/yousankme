package me.yousank.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Ship {
    enum ShipType {CARRIER, BATTLESHIP, CRUISER, DESTROYER, SUBMARINE}
    int[] position;
    int size;
}