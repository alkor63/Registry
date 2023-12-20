package pro.sky.registry.entity;

public enum Speciality {
    SPEC_1("ПЕДИАТР"),
    SPEC_2("ТЕРАПЕВТ"),
    SPEC_3("КАРДИОЛОГ"),
    SPEC_4("СТАМАТОЛОГ"),
    SPEC_5("ЛОР");

    private final String docSpec;

    Speciality(String docSpec) {
        this.docSpec = docSpec;
    }

    public String getDocSpec() {
        return docSpec;
    }

    @Override
    public String toString() {
        return " специализация врача - " + docSpec;
    }
}
