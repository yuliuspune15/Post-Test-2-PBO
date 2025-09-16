package service;

import model.Reservasi;
import java.util.ArrayList;
import java.util.List;

public class ReservasiService {
    private final List<Reservasi> reservasiList = new ArrayList<>();

    public void tambahReservasi(Reservasi reservasi) {
        reservasiList.add(reservasi);
    }

    public List<Reservasi> getAllReservasi() {
        return reservasiList;
    }
}
