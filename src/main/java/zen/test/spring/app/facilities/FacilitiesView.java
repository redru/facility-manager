package zen.test.spring.app.facilities;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.EventHandler;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import java.util.Optional;

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
  public void loadFacilities() {
    Notification.show("Aaaaa");
  }

  @EventHandler
  private void sayHello() {
    // Called from the template click handler
    getModel().setGreeting(Optional.ofNullable(getModel().getUserInput())
        .filter(userInput -> !userInput.isEmpty())
        .map(greeting -> String.format("Hello %s!", greeting))
        .orElse(EMPTY_NAME_GREETING));
  }

}
