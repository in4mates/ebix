/**
 * generated by Xtext
 */
package org.ebix.umm.generator;

import com.google.inject.Inject;
import org.ebix.umm.generator.GenerateXsd;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Extension;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class UmmGenerator implements IGenerator {
  @Inject
  @Extension
  private GenerateXsd generator;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    this.generator.generateXsd(resource, fsa);
  }
}
