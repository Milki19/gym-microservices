package com.projekat.notification_service.ms_sm_ac.runner;
import com.projekat.notification_service.ms_sm_ac.domain.Admin;
import com.projekat.notification_service.ms_sm_ac.domain.UserType;
import com.projekat.notification_service.ms_sm_ac.repository.AdminResopitory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Profile({"default"})
@Component
public class TestDataRunner implements CommandLineRunner {

    private AdminResopitory adminResopitory;

    public TestDataRunner(AdminResopitory adminResopitory) {
        this.adminResopitory = adminResopitory;
    }

    @Override
    public void run(String... args) throws Exception {
        //Insert admin
        Admin admin = new Admin();
        admin.setUsername("admin");
        admin.setBirthDate(LocalDate.of(2000, 1, 1));
        admin.setEmail("admin@example.com");
        admin.setPassword("admin");
        admin.setFirstName("Demo");
        admin.setLastName("Admin");
        admin.setUserType(UserType.ADMIN);

        Admin admin1 = new Admin();
        admin1.setUsername("admin2");
        admin1.setBirthDate(LocalDate.of(2000, 1, 1));
        admin1.setEmail("admin2@example.com");
        admin1.setPassword("admin");
        admin1.setFirstName("Second");
        admin1.setLastName("Admin");
        admin1.setUserType(UserType.ADMIN);

        adminResopitory.save(admin);
        adminResopitory.save(admin1);
    }
}
