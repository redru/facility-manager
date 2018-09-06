package zen.test.spring.app.facilities;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import zen.test.spring.app.common.menubar.MenuBar;

@Route(value = "facilities", layout = MenuBar.class)
public class Facilities extends Div {

  public Facilities() {
    add(new FacilitiesView());
  }

}
