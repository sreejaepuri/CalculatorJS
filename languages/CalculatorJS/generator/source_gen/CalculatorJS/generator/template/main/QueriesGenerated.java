package CalculatorJS.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

@Generated
public class QueriesGenerated {
  public static Object propertyMacro_GetPropertyValue_3040828037357529121(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_5843916997827706505(final PropertyMacroContext _context) {
    return _context.createUniqueName("value", SNodeOperations.getParent(_context.getNode()));
  }
  public static Object propertyMacro_GetPropertyValue_5843916997827769729(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_5843916997827767508(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_3040828037357549853(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + ".js";
  }
  public static Object propertyMacro_GetPropertyValue_5843916997827774571(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_5843916997827704242(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_5843916997827775279(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_5843916997827704668(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_3040828037357546040(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) + ".html";
  }
  public static Object referenceMacro_GetReferent_5843916997827740948(final ReferenceMacroContext _context) {
    return SLinkOperations.getTarget(ListSequence.fromList(SLinkOperations.getChildren(_context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getReferenceLink(0x73f4da510e3e448cL, 0xa68b428ef5388ac7L, 0x5119c38c10631080L, 0x5119c38c10631081L, "target")), "inputVariables"), MetaAdapterFactory.getContainmentLink(0xa48297046b1b4b3fL, 0x8122a4a2e6ac90ffL, 0x2cc6dbd4f2de484L, 0x2cc6dbd4f2de6d8L, "declarations"))).first(), MetaAdapterFactory.getContainmentLink(0xa48297046b1b4b3fL, 0x8122a4a2e6ac90ffL, 0x76eb757dfbac8133L, 0x76eb757dfbac81c8L, "id"));
  }
  public static SNode sourceNodeQuery_5843916997827733152(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x73f4da510e3e448cL, 0xa68b428ef5388ac7L, 0x5119c38c1062e310L, 0x5119c38c1062e313L, "value"));
  }
  public static Iterable<SNode> sourceNodesQuery_5843916997827704965(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x73f4da510e3e448cL, 0xa68b428ef5388ac7L, 0x1c0cfa9a1cc95c07L, 0x5119c38c1062e30eL, "inputField"));
  }
  public static Iterable<SNode> sourceNodesQuery_5843916997827732161(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x73f4da510e3e448cL, 0xa68b428ef5388ac7L, 0x1c0cfa9a1cc95c07L, 0x5119c38c1062e358L, "outputField"));
  }
  public static Iterable<SNode> sourceNodesQuery_5843916997827703102(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x73f4da510e3e448cL, 0xa68b428ef5388ac7L, 0x1c0cfa9a1cc95c07L, 0x5119c38c1062e30eL, "inputField"));
  }
  public static Iterable<SNode> sourceNodesQuery_5843916997827703828(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x73f4da510e3e448cL, 0xa68b428ef5388ac7L, 0x1c0cfa9a1cc95c07L, 0x5119c38c1062e358L, "outputField"));
  }
}