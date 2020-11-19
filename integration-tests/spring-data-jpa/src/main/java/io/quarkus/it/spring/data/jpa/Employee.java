package io.quarkus.it.spring.data.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// TODO: @Entity(name = "EmployeeEntity")
@Entity
@Table(name = "org_employee_table")
public class Employee extends AbstractEntity {

    @Column(name = "user_id")
    private String userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", nullable = false)
    private Team belongsToTeam;

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Team getBelongsToTeam() {
        return belongsToTeam;
    }

    @Entity // TODO: (name = "UserRoleEntity")
    @Table(name = "org_team_table")
    public static class Team extends AbstractEntity {

        private String name;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "unit_id", nullable = false)
        private OrgUnit organizationalUnit;

        public String getName() {
            return name;
        }

        public OrgUnit getOrganizationalUnit() {
            return organizationalUnit;
        }
    }

    @Entity // TODO: (name = "OrgUnitEntity")
    @Table(name = "org_unit_table")
    public static class OrgUnit extends AbstractEntity {

        private String name;
    }
}
