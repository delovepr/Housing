package ua.epam.i18n;

import java.util.ListResourceBundle;

/**
 *
 * @author Ivanov Alexander
 */
public class WelcomePage_en_GB extends ListResourceBundle {

    static final Object[][] contents = {
        {"welcome.page.welcome", "Welcome to our start page!"},
        {"welcome.page.loggin", "You are logginin as "},
        {"welcome.page.create", "Create request"},
        {"welcome.page.show", "Show my requests"},
        {"welcome.page.exit", "For exit push "},
        {"welcome.page.button", "Exit"},
        {"welcome.page.flag", "images/flag_GB.jpg"}};

    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
