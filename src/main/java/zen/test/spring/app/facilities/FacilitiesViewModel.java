package zen.test.spring.app.facilities;

import com.vaadin.flow.templatemodel.Include;
import com.vaadin.flow.templatemodel.TemplateModel;
import java.util.List;
import zen.test.spring.models.Facility;

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

  @Include({ "name", "description" })
  void setFacilitiesList(List<Facility> facilitiesList);

  List<Facility> getFacilitiesList();

}
