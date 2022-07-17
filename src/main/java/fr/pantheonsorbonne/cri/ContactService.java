package fr.pantheonsorbonne.cri;

public class ContactService {
    RepositoryContact repo = new RepositoryContact();

    public Contact findContactWithPhoneNumber(String number) {
        return repo.getContactWithPhoneNumber(number);
    }
}