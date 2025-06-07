package academy.devdojo.javaoneforall.javacore.Jfinalmodifier.domain;

public enum CustomerType {
    INDIVIDUAL("Individual", 1),
    COMPANY("Company", 2),
    STARTUP("Startup", 3);

    private final String REPORT_VALUE;
    private final int DB_VALUE;

    CustomerType(String reportValue, int dbValue) {
        this.REPORT_VALUE = reportValue;
        this.DB_VALUE = dbValue;
    }

    public static CustomerType getByReportValue(String reportValue) {
        for (CustomerType value : values()) {
            if (reportValue.equalsIgnoreCase(value.getREPORT_VALUE())) {
                return value;
            }
        }
        return null;
    }

    public String getREPORT_VALUE() {
        return REPORT_VALUE;
    }

    public int getDB_VALUE() {
        return DB_VALUE;
    }
}
