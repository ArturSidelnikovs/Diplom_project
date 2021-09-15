package edu.app.model.role;

import java.util.Arrays;
import java.util.List;

public enum RoleEnum {
    USER (Arrays.asList(AccessForRoles.READ)),
    ADMIN (Arrays.asList(AccessForRoles.READ, AccessForRoles.WRITE));

    private final List <AccessForRoles> accesses;

    RoleEnum(List<AccessForRoles> accesses) {
        this.accesses = accesses;
    }

    public List<AccessForRoles> getAccesses() {
        return accesses;
    }
}
