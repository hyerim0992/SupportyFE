package com.example.supporty;

public class DrugListEntity {
    private final String name;
    private final boolean checked;

    public DrugListEntity(String name, boolean checked) {
        this.name = name;
        this.checked = checked;
    }

    public String getName() {
        return name;
    }

    public boolean isChecked() {
        return checked;
    }
}
