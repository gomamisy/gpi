package warmup.layout;

import java.util.List;

/**
 * This is a container within a tree of containers and components.
 * A container is a component that has children components.
 * The children are managed as an ordered set.
 * Children components are painted on top of their parent container.
 * 
 * @author Pr. Olivier Gruber (olivier dot gruber at acm dot org)
 */

public class Container extends Component {
	protected List<Component> m_children;

  Container() {
    throw new Error("Not Yet Implemented");
  }

  public Container(Container parent) {
    throw new Error("Not Yet Implemented");
  }

  /**
   * @return the number of components that are 
   *         children to this container
   */
  public int childrenCount() {
    return m_children.size();
  }

  /**
   * @return the component indexed by the given
   *         index.
   */
  public Component childrenAt(int i) {
    return m_children.get(i);
  }

  /**
   * Select the component, on top, at the given location.
   * The location is given in local coordinates.
   * Reminder: children are above their parent.
   * @param x
   * @param y
   * @return this selected component 
   */
  public Component select(int x, int y) {
    throw new Error("Not Yet Implemented");
  }

}
