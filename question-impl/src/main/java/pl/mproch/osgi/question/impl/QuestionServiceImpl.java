package pl.mproch.osgi.question.impl;

import lombok.extern.slf4j.Slf4j;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import pl.mproch.osgi.question.QuestionService;
import pl.mproch.osgi.question.SampleConfig;
import pl.mproch.osgi.user.UserService;

@Designate(ocd = SampleConfig.class)
@Component(immediate = true, service = QuestionService.class,
        configurationPid = "pl.mproch.answers", properties = "export.cfg")
@Slf4j
public class QuestionServiceImpl implements QuestionService {

    private SampleConfig sampleConfig;

    @Reference
    private UserService userService;

    public String why(Long userId, String question) {
        return "answer for " + userService.loadById(userId) + "is: " + sampleConfig.stringProperty();
    }


    @Activate
    public void start(SampleConfig config) {
        this.sampleConfig = config;
        log.info("Got config with stringProperty [{}]", config.stringProperty());
    }


}


