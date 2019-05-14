package warmup.tree;

import java.util.Iterator;
import java.util.List;

/**
 * This is a node of a tree.
 * Each node has a name.
 * Therefore, each node is reachable through a path.
 * Each node may be attached an object.
 * 
 * @author Pr. Olivier Gruber  (olivier dot gruber at acm dot org)
 */

public class Node {
  Node m_parent;
  String m_name;
  List<Node> m_children;
  Object m_attachment;

  /**
   * @param name
   * @throws IllegalArgumentException if the name contains 
   *         the character Tree.pathSeparator
   */
  protected Node(String name) {
    throw new Error("NYI");
  }

  /**
   * @param name
   * @throws IllegalArgumentException if the name contains 
   *         the character Tree.pathSeparator
   */
  public Node(Node parent, String name) {
    throw new Error("NYI");
  }

  public String toString() {
    if (m_name == null)
      return "";
    return m_name;
  }

  public Node parent() {
    return m_parent;
  }

  public void attach(Object e) {
    m_attachment = e;
  }

  public Object attachment() {
    return m_attachment;
  }

  public void name(String name) {
    m_name = name;
  }

  public String name() {
    return m_name;
  }

  public String path() {
    throw new Error("NYI");
  }

  public void remove() {
    throw new Error("NYI");
  }

  public Iterator<Node> children() {
    throw new Error("NYI");
  }
  
  public Node child(String name) {
    throw new Error("NYI");
  }

}
