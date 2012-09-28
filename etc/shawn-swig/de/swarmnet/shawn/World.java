/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.29
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.swarmnet.shawn;

public class World extends TagContainer {
  private long swigCPtr;

  protected World(long cPtr, boolean cMemoryOwn) {
    super(ShawnJNI.SWIGWorldUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(World obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      ShawnJNI.delete_World(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public World() {
    this(ShawnJNI.new_World(), true);
  }

  public void init() {
    ShawnJNI.World_init(swigCPtr);
  }

  public void add_node(Node arg0) {
    ShawnJNI.World_add_node(swigCPtr, Node.getCPtr(arg0));
  }

  public void remove_node(Node arg0) {
    ShawnJNI.World_remove_node(swigCPtr, Node.getCPtr(arg0));
  }

  public void add_default_processor(String arg0) {
    ShawnJNI.World_add_default_processor(swigCPtr, arg0);
  }

  public void set_edge_model(SWIGTYPE_p_shawn__EdgeModel arg0) {
    ShawnJNI.World_set_edge_model(swigCPtr, SWIGTYPE_p_shawn__EdgeModel.getCPtr(arg0));
  }

  public void set_transmission_model(SWIGTYPE_p_shawn__TransmissionModel arg0) {
    ShawnJNI.World_set_transmission_model(swigCPtr, SWIGTYPE_p_shawn__TransmissionModel.getCPtr(arg0));
  }

  public void set_communication_model(SWIGTYPE_p_shawn__CommunicationModel arg0) {
    ShawnJNI.World_set_communication_model(swigCPtr, SWIGTYPE_p_shawn__CommunicationModel.getCPtr(arg0));
  }

  public SWIGTYPE_p_shawn__EdgeModel edge_model() {
    return new SWIGTYPE_p_shawn__EdgeModel(ShawnJNI.World_edge_model(swigCPtr), false);
  }

  public SWIGTYPE_p_shawn__EdgeModel edge_model_w() {
    return new SWIGTYPE_p_shawn__EdgeModel(ShawnJNI.World_edge_model_w(swigCPtr), false);
  }

  public SWIGTYPE_p_shawn__TransmissionModel transmission_model() {
    return new SWIGTYPE_p_shawn__TransmissionModel(ShawnJNI.World_transmission_model(swigCPtr), false);
  }

  public SWIGTYPE_p_shawn__TransmissionModel transmission_model_w() {
    return new SWIGTYPE_p_shawn__TransmissionModel(ShawnJNI.World_transmission_model_w(swigCPtr), false);
  }

  public SWIGTYPE_p_shawn__CommunicationModel communication_model() {
    return new SWIGTYPE_p_shawn__CommunicationModel(ShawnJNI.World_communication_model(swigCPtr), false);
  }

  public SWIGTYPE_p_shawn__CommunicationModel communication_model_w() {
    return new SWIGTYPE_p_shawn__CommunicationModel(ShawnJNI.World_communication_model_w(swigCPtr), false);
  }

  public void set_simulation_controller(SimulationController arg0) {
    ShawnJNI.World_set_simulation_controller(swigCPtr, SimulationController.getCPtr(arg0));
  }

  public SimulationController simulation_controller_w() {
    return new SimulationController(ShawnJNI.World_simulation_controller_w(swigCPtr), false);
  }

  public SimulationController simulation_controller() {
    return new SimulationController(ShawnJNI.World_simulation_controller(swigCPtr), false);
  }

  public void set_movement_controller(SWIGTYPE_p_shawn__MovementController arg0) {
    ShawnJNI.World_set_movement_controller(swigCPtr, SWIGTYPE_p_shawn__MovementController.getCPtr(arg0));
  }

  public SWIGTYPE_p_shawn__MovementController movement_controller_w() {
    return new SWIGTYPE_p_shawn__MovementController(ShawnJNI.World_movement_controller_w(swigCPtr), false);
  }

  public SWIGTYPE_p_shawn__MovementController movement_controller() {
    return new SWIGTYPE_p_shawn__MovementController(ShawnJNI.World_movement_controller(swigCPtr), false);
  }

  public Vec lower_left() {
    return new Vec(ShawnJNI.World_lower_left(swigCPtr), false);
  }

  public Vec upper_right() {
    return new Vec(ShawnJNI.World_upper_right(swigCPtr), false);
  }

  public void add_edge(Node arg0, Node arg1) {
    ShawnJNI.World_add_edge(swigCPtr, Node.getCPtr(arg0), Node.getCPtr(arg1));
  }

  public void clear() {
    ShawnJNI.World_clear(swigCPtr);
  }

  public void set_size_hint(double hint) {
    ShawnJNI.World_set_size_hint(swigCPtr, hint);
  }

  public String uuid() {
    return ShawnJNI.World_uuid(swigCPtr);
  }

  public int active_nodes_count() {
    return ShawnJNI.World_active_nodes_count(swigCPtr);
  }

  public int sleeping_nodes_count() {
    return ShawnJNI.World_sleeping_nodes_count(swigCPtr);
  }

  public int inactive_nodes_count() {
    return ShawnJNI.World_inactive_nodes_count(swigCPtr);
  }

  public boolean is_done() {
    return ShawnJNI.World_is_done(swigCPtr);
  }

  public int simulation_round() {
    return ShawnJNI.World_simulation_round(swigCPtr);
  }

  public double current_time() {
    return ShawnJNI.World_current_time(swigCPtr);
  }

  public boolean has_size_hint() {
    return ShawnJNI.World_has_size_hint(swigCPtr);
  }

  public double size_hint() {
    return ShawnJNI.World_size_hint(swigCPtr);
  }

  public void step() {
    ShawnJNI.World_step(swigCPtr);
  }

  public void send_message(Node source, SWIGTYPE_p_shawn__RefcntPointerTshawn__Message_t mh) {
    ShawnJNI.World_send_message(swigCPtr, Node.getCPtr(source), SWIGTYPE_p_shawn__RefcntPointerTshawn__Message_t.getCPtr(mh));
  }

  public void reset() {
    ShawnJNI.World_reset(swigCPtr);
  }

  public void add_node_change_listener(NodeChangeListener arg0) {
    ShawnJNI.World_add_node_change_listener(swigCPtr, NodeChangeListener.getCPtr(arg0));
  }

  public void remove_node_change_listener(NodeChangeListener arg0) {
    ShawnJNI.World_remove_node_change_listener(swigCPtr, NodeChangeListener.getCPtr(arg0));
  }

  public boolean can_communicate_bidi(Node arg0, Node arg1) {
    return ShawnJNI.World_can_communicate_bidi(swigCPtr, Node.getCPtr(arg0), Node.getCPtr(arg1));
  }

  public boolean can_communicate_uni(Node arg0, Node arg1) {
    return ShawnJNI.World_can_communicate_uni(swigCPtr, Node.getCPtr(arg0), Node.getCPtr(arg1));
  }

  public int node_count() {
    return ShawnJNI.World_node_count(swigCPtr);
  }

  public int node_id_space_size() {
    return ShawnJNI.World_node_id_space_size(swigCPtr);
  }

  public SWIGTYPE_p_shawn__SkipNullIteratorTshawn__Node_std__vectorTshawn__Node_p_t_shawn__World__NodeVector__iterator_t begin_nodes_w() {
    return new SWIGTYPE_p_shawn__SkipNullIteratorTshawn__Node_std__vectorTshawn__Node_p_t_shawn__World__NodeVector__iterator_t(ShawnJNI.World_begin_nodes_w(swigCPtr), true);
  }

  public SWIGTYPE_p_shawn__SkipNullIteratorTshawn__Node_std__vectorTshawn__Node_p_t_shawn__World__NodeVector__iterator_t end_nodes_w() {
    return new SWIGTYPE_p_shawn__SkipNullIteratorTshawn__Node_std__vectorTshawn__Node_p_t_shawn__World__NodeVector__iterator_t(ShawnJNI.World_end_nodes_w(swigCPtr), true);
  }

  public Node find_node_by_id_w(int arg0) {
    long cPtr = ShawnJNI.World_find_node_by_id_w(swigCPtr, arg0);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Node find_node_by_label_w(String arg0) {
    long cPtr = ShawnJNI.World_find_node_by_label_w(swigCPtr, arg0);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public SWIGTYPE_p_shawn__SkipNullIteratorTshawn__Node_const_std__vectorTshawn__Node_p_t_shawn__World__NodeVector__const_iterator_t begin_nodes() {
    return new SWIGTYPE_p_shawn__SkipNullIteratorTshawn__Node_const_std__vectorTshawn__Node_p_t_shawn__World__NodeVector__const_iterator_t(ShawnJNI.World_begin_nodes(swigCPtr), true);
  }

  public SWIGTYPE_p_shawn__SkipNullIteratorTshawn__Node_const_std__vectorTshawn__Node_p_t_shawn__World__NodeVector__const_iterator_t end_nodes() {
    return new SWIGTYPE_p_shawn__SkipNullIteratorTshawn__Node_const_std__vectorTshawn__Node_p_t_shawn__World__NodeVector__const_iterator_t(ShawnJNI.World_end_nodes(swigCPtr), true);
  }

  public Node find_node_by_id(int arg0) {
    long cPtr = ShawnJNI.World_find_node_by_id(swigCPtr, arg0);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public Node find_node_by_label(String arg0) {
    long cPtr = ShawnJNI.World_find_node_by_label(swigCPtr, arg0);
    return (cPtr == 0) ? null : new Node(cPtr, false);
  }

  public SWIGTYPE_p_shawn__EdgeModel__const_adjacency_iterator begin_adjacent_nodes(Node v, SWIGTYPE_p_shawn__EdgeModel__CommunicationDirection d) {
    return new SWIGTYPE_p_shawn__EdgeModel__const_adjacency_iterator(ShawnJNI.World_begin_adjacent_nodes__SWIG_0(swigCPtr, Node.getCPtr(v), SWIGTYPE_p_shawn__EdgeModel__CommunicationDirection.getCPtr(d)), true);
  }

  public SWIGTYPE_p_shawn__EdgeModel__const_adjacency_iterator begin_adjacent_nodes(Node v) {
    return new SWIGTYPE_p_shawn__EdgeModel__const_adjacency_iterator(ShawnJNI.World_begin_adjacent_nodes__SWIG_1(swigCPtr, Node.getCPtr(v)), true);
  }

  public SWIGTYPE_p_shawn__EdgeModel__const_adjacency_iterator end_adjacent_nodes(Node v) {
    return new SWIGTYPE_p_shawn__EdgeModel__const_adjacency_iterator(ShawnJNI.World_end_adjacent_nodes(swigCPtr, Node.getCPtr(v)), true);
  }

  public SWIGTYPE_p_shawn__EdgeModel__adjacency_iterator begin_adjacent_nodes_w(Node v, SWIGTYPE_p_shawn__EdgeModel__CommunicationDirection d) {
    return new SWIGTYPE_p_shawn__EdgeModel__adjacency_iterator(ShawnJNI.World_begin_adjacent_nodes_w__SWIG_0(swigCPtr, Node.getCPtr(v), SWIGTYPE_p_shawn__EdgeModel__CommunicationDirection.getCPtr(d)), true);
  }

  public SWIGTYPE_p_shawn__EdgeModel__adjacency_iterator begin_adjacent_nodes_w(Node v) {
    return new SWIGTYPE_p_shawn__EdgeModel__adjacency_iterator(ShawnJNI.World_begin_adjacent_nodes_w__SWIG_1(swigCPtr, Node.getCPtr(v)), true);
  }

  public SWIGTYPE_p_shawn__EdgeModel__adjacency_iterator end_adjacent_nodes_w(Node v) {
    return new SWIGTYPE_p_shawn__EdgeModel__adjacency_iterator(ShawnJNI.World_end_adjacent_nodes_w(swigCPtr, Node.getCPtr(v)), true);
  }

  public EventScheduler scheduler_w() {
    return new EventScheduler(ShawnJNI.World_scheduler_w(swigCPtr), false);
  }

  public EventScheduler scheduler() {
    return new EventScheduler(ShawnJNI.World_scheduler(swigCPtr), false);
  }

  public void add_pre_step_task(SWIGTYPE_p_shawn__RefcntPointerTshawn__SimulationTask_t arg0) {
    ShawnJNI.World_add_pre_step_task(swigCPtr, SWIGTYPE_p_shawn__RefcntPointerTshawn__SimulationTask_t.getCPtr(arg0));
  }

  public void add_post_step_task(SWIGTYPE_p_shawn__RefcntPointerTshawn__SimulationTask_t arg0) {
    ShawnJNI.World_add_post_step_task(swigCPtr, SWIGTYPE_p_shawn__RefcntPointerTshawn__SimulationTask_t.getCPtr(arg0));
  }

}