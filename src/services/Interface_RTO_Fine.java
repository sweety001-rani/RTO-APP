package services;

public interface Interface_RTO_Fine {
    public void payfine(String number_plate) throws Exception;
    public void addfine(String number_plate) throws Exception;
    public void remove_fine(String number_plate) throws Exception;
}
