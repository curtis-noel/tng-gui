package gov.uscis.dhs.nfts.cucumber.stepdefs;

import gov.uscis.dhs.nfts.TngguiApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TngguiApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
