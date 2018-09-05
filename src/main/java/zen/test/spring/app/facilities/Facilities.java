package zen.test.spring.app.facilities;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import zen.test.spring.app.MainLayout;

@Route(value = "facilities", layout = MainLayout.class)
public class Facilities extends Div {

  public Facilities() {
    add(new FacilitiesView());
  }

}
