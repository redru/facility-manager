package zen.test.spring.app.common.menubar;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.ParentLayout;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;
import zen.test.spring.app.MainLayout;
import zen.test.spring.app.facilities.Facilities;

@ParentLayout(MainLayout.class)
public class MenuBar extends Div implements RouterLayout {

  public MenuBar() {
    add(
        new RouterLink("Home", Facilities.class),
        new RouterLink("Facilities", Facilities.class)
    );
  }

}
