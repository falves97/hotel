package model.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Hotel {
    private String name;
    private String cnpj;
    private  String phone;
    private LocalDate checkin;
    private LocalDate checkout;
    private Set<ExtraService> extraServices;
    private Set<RoomType> roomTypes;

    public Hotel() {
        extraServices = new HashSet<>();
        roomTypes = new HashSet<>();
    }

    public Hotel(String name, String cnpj, String phone, LocalDate checkin, LocalDate checkout, Set<ExtraService> extraServices, Set<RoomType> roomTypes) {
        this.name = name;
        this.cnpj = cnpj;
        this.phone = phone;
        this.checkin = checkin;
        this.checkout = checkout;
        this.extraServices = extraServices;
        this.roomTypes = roomTypes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

    public void addExtraService(ExtraService extraService) {
        this.extraServices.add(extraService);
    }

    public boolean removeExtraService(ExtraService extraService) {
        return this.extraServices.remove(extraService);
    }

    public void addRoomType(RoomType roomType) {
        this.roomTypes.add(roomType);
    }

    public boolean removeRoomType(RoomType roomType) {
        return this.roomTypes.remove(roomType);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", phone='" + phone + '\'' +
                ", checkin=" + checkin +
                ", checkout=" + checkout +
                ", extraServices=" + extraServices +
                ", roomTypes=" + roomTypes +
                '}';
    }
}
