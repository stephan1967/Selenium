package Politie;

import com.github.javafaker.Faker;
import java.util.Locale;

public class EnterpriseForm {

    private String docNaam;
    private String uuid;
    private String verstuurKnop;
    private String formNaam;

    EnterpriseForm() {
        final Faker faker = new Faker(new Locale("nl"));
        docNaam = "autotestFormulierSjabloon";
        uuid = "0a1d2eb8-74f8-4999-bfc3-49e92142ad1f";
        verstuurKnop = String.join("-", faker.lorem().words(2));
        formNaam = String.join("-", faker.lorem().words(3));
    }

    public String getUuid() {
        return uuid;
    }

    public String getDocUrl() {
        return docNaam.toLowerCase();
    }
}
