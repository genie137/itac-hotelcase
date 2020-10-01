package nl.hotel;

public class Guest {
    private String voornaam;
    private String achternaam;
    private int telefoonnummer;
    private String email;

    public Guest(String voornaam, String achternaam, int telefoonnummer, String email) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.telefoonnummer = telefoonnummer;
        this.email = email;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public int getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(int telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", telefoonnummer=" + telefoonnummer +
                ", email='" + email + '\'' +
                '}';
    }
}
