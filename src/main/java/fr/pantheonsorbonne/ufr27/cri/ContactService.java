package fr.pantheonsorbonne.ufr27.cri;

public class ContactService {
    RepositoryContact repo = new RepositoryContact();

    public Contact findContactWithPhoneNumber(String number) {
        if(number != null && number.length() == 10) {
            return repo.getContactWithPhoneNumber(number);
        }

        return null;
    }
}