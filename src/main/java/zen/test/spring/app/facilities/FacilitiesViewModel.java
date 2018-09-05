package zen.test.spring.app.facilities;

import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * Model for the template.
 */
public interface FacilitiesViewModel extends TemplateModel {

  /**
   * Gets user input from corresponding template page.
   *
   * @return user input string
   */
  String getUserInput();

  /**
   * Sets greeting that is displayed in corresponding template page.
   *
   * @param greeting
   *            greeting string
   */
  void setGreeting(String greeting);

}
