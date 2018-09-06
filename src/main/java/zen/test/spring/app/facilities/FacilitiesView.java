package zen.test.spring.app.facilities;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.EventHandler;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import zen.test.spring.models.Facility;

@Tag("facilities-view")
@HtmlImport("frontend://src/facilities-view.component.html")
public class FacilitiesView extends PolymerTemplate<FacilitiesViewModel> {

  private static final String EMPTY_NAME_GREETING = "Please enter your name";

  /**
   * Creates the hello world template.
   */
  public FacilitiesView() {
    setId("template");
    getModel().setGreeting(EMPTY_NAME_GREETING);
  }

  @ClientCallable
  private void loadFacilities() {
    List<Facility> facilitiesList = new ArrayList<>();

    for (int i = 0; i < 20; i++) {
      Facility facility = new Facility();
      facility.setName("FACILITY " + i);
      facility.setDescription("This is the description for facility " + i);

      facilitiesList.add(facility);
    }

    this.setFacilitiesList(facilitiesList);
  }

  @EventHandler
  private void sayHello() {
    getModel().setGreeting(Optional.ofNullable(getModel().getUserInput())
        .filter(userInput -> !userInput.isEmpty())
        .map(greeting -> String.format("Hello %s!", greeting))
        .orElse(EMPTY_NAME_GREETING));
  }

  private void setFacilitiesList(List<Facility> facilitiesList) {
    getModel().setFacilitiesList(facilitiesList);
  }

  private List<Facility> getFacilitiesList() {
    return getModel().getFacilitiesList();
  }

}
