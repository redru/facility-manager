package zen.test.spring.app.common.menubar;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.ParentLayout;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;
import zen.test.spring.app.MainLayout;
import zen.test.spring.app.facilities.Facilities;

@ParentLayout(MainLayout.class)
public class MenuBar extends Div implements RouterLayout {

  private HorizontalLayout menuElementsContainer = new HorizontalLayout();

  public MenuBar() {
    menuElementsContainer.setId("menuElementsContainer");
    add(menuElementsContainer);

    addMenuElement(Facilities.class, "Home");
    addMenuElement(Facilities.class, "Facilities");
  }

  private void addMenuElement(Class<? extends Component> navigationTarget, String name) {
    RouterLink link = new RouterLink(name, navigationTarget);
    menuElementsContainer.add(new RouterLink(name, navigationTarget));
  }

}
