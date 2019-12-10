package training.ricardo.timetracker.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import training.ricardo.timetracker.core.dao.TimeEntry;

import java.util.ArrayList;
import java.util.List;


@Configuration
@ComponentScan("training.ricardo.timetracker.core")
public class TrackerCoreConfig {

    @Bean(name = "timesheet")
    public List<TimeEntry> timeEntries() {
        return new ArrayList<>();
    }
}
