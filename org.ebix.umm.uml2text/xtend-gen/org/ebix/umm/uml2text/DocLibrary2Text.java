package org.ebix.umm.uml2text;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.ebix.umm.uml2text.Constraint2Text;
import org.ebix.umm.uml2text.Multiplicity2Text;
import org.ebix.umm.uml2text.Name2Text;
import org.ebix.umm.uml2text.UmmStereotypes;
import org.ebix.umm.uml2text.file.FileWriter;
import org.ebix.umm.uml2text.model.DocLibrary;
import org.ebix.umm.uml2text.model.impl.DocLibraryImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DocLibrary2Text {
  @Extension
  private Constraint2Text constraint2Text = new Function0<Constraint2Text>() {
    public Constraint2Text apply() {
      Constraint2Text _constraint2Text = new Constraint2Text();
      return _constraint2Text;
    }
  }.apply();
  
  @Extension
  private DocLibrary doclibrary;
  
  @Extension
  private Multiplicity2Text multiplicity2Text = new Function0<Multiplicity2Text>() {
    public Multiplicity2Text apply() {
      Multiplicity2Text _multiplicity2Text = new Multiplicity2Text();
      return _multiplicity2Text;
    }
  }.apply();
  
  @Extension
  private Name2Text name2Text = new Function0<Name2Text>() {
    public Name2Text apply() {
      Name2Text _name2Text = new Name2Text();
      return _name2Text;
    }
  }.apply();
  
  private UmmStereotypes ummStereotypes;
  
  public DocLibrary2Text(final UmmStereotypes ummStereotypes) {
    this.ummStereotypes = ummStereotypes;
    DocLibraryImpl _docLibraryImpl = new DocLibraryImpl(ummStereotypes.DocLibrary);
    this.doclibrary = _docLibraryImpl;
  }
  
  public String generate(final Model umlModel, final FileWriter fw) {
    String _xblockexpression = null;
    {
      InputOutput.<String>println("Generating DOCLibraries ...");
      EList<Element> _allOwnedElements = umlModel.allOwnedElements();
      Iterable<org.eclipse.uml2.uml.Package> _filter = Iterables.<org.eclipse.uml2.uml.Package>filter(_allOwnedElements, org.eclipse.uml2.uml.Package.class);
      final Function1<org.eclipse.uml2.uml.Package,Boolean> _function = new Function1<org.eclipse.uml2.uml.Package,Boolean>() {
          public Boolean apply(final org.eclipse.uml2.uml.Package p) {
            boolean _isDocLibrary = DocLibrary2Text.this.doclibrary.isDocLibrary(p);
            return Boolean.valueOf(_isDocLibrary);
          }
        };
      Iterable<org.eclipse.uml2.uml.Package> _filter_1 = IterableExtensions.<org.eclipse.uml2.uml.Package>filter(_filter, _function);
      for (final org.eclipse.uml2.uml.Package umlPackage : _filter_1) {
        {
          String _name = umlPackage.getName();
          String _plus = ("DOCLibrary " + _name);
          InputOutput.<String>println(_plus);
          String _qualifiedName = umlPackage.getQualifiedName();
          String _fileName = this.name2Text.fileName(_qualifiedName);
          CharSequence _generateDocLibrary = this.generateDocLibrary(umlPackage);
          fw.writeFile(_fileName, _generateDocLibrary);
        }
      }
      String _println = InputOutput.<String>println("Done.");
      _xblockexpression = (_println);
    }
    return _xblockexpression;
  }
  
  public CharSequence generateDocLibrary(final org.eclipse.uml2.uml.Package umlPackage) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("DocLibrary \"");
    String _qualifiedName = umlPackage.getQualifiedName();
    _builder.append(_qualifiedName, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("businessTerm:      ");
    {
      List<String> _businessTerm = this.doclibrary.businessTerm(umlPackage);
      boolean _hasElements = false;
      for(final String term : _businessTerm) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "	");
        }
        _builder.append("\"");
        _builder.append(term, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("copyright:         ");
    {
      List<String> _copyright = this.doclibrary.copyright(umlPackage);
      boolean _hasElements_1 = false;
      for(final String copyright : _copyright) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
        } else {
          _builder.appendImmediate(", ", "	");
        }
        _builder.append("\"");
        _builder.append(copyright, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("owner:             ");
    {
      List<String> _owner = this.doclibrary.owner(umlPackage);
      boolean _hasElements_2 = false;
      for(final String owner : _owner) {
        if (!_hasElements_2) {
          _hasElements_2 = true;
        } else {
          _builder.appendImmediate(", ", "	");
        }
        _builder.append("\"");
        _builder.append(owner, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("reference:         ");
    {
      List<String> _reference = this.doclibrary.reference(umlPackage);
      boolean _hasElements_3 = false;
      for(final String reference : _reference) {
        if (!_hasElements_3) {
          _hasElements_3 = true;
        } else {
          _builder.appendImmediate(", ", "	");
        }
        _builder.append("\"");
        _builder.append(reference, "	");
        _builder.append("\"");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("uniqueIdentifier:  \"");
    String _uniqueIdentifier = this.doclibrary.uniqueIdentifier(umlPackage);
    _builder.append(_uniqueIdentifier, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("versionIdentifier: \"");
    String _versionIdentifier = this.doclibrary.versionIdentifier(umlPackage);
    _builder.append(_versionIdentifier, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("baseURN:           \"");
    String _baseURN = this.doclibrary.baseURN(umlPackage);
    _builder.append(_baseURN, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("namespacePrefix:   \"");
    String _namespacePrefix = this.doclibrary.namespacePrefix(umlPackage);
    _builder.append(_namespacePrefix, "	");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BIE: ");
    org.eclipse.uml2.uml.Package _bieVersion = this.doclibrary.bieVersion(umlPackage);
    String _qualifiedName_1 = _bieVersion==null?(String)null:_bieVersion.getQualifiedName();
    _builder.append(_qualifiedName_1, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("BDT: ");
    org.eclipse.uml2.uml.Package _bdtVersion = this.doclibrary.bdtVersion(umlPackage);
    String _qualifiedName_2 = _bdtVersion==null?(String)null:_bdtVersion.getQualifiedName();
    _builder.append(_qualifiedName_2, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<NamedElement> _ownedMembers = umlPackage.getOwnedMembers();
      Iterable<org.eclipse.uml2.uml.Class> _filter = Iterables.<org.eclipse.uml2.uml.Class>filter(_ownedMembers, org.eclipse.uml2.uml.Class.class);
      final Function1<org.eclipse.uml2.uml.Class,Boolean> _function = new Function1<org.eclipse.uml2.uml.Class,Boolean>() {
          public Boolean apply(final org.eclipse.uml2.uml.Class c) {
            boolean _isStereotypeApplied = c.isStereotypeApplied(DocLibrary2Text.this.ummStereotypes.InfEnvelope.value);
            return Boolean.valueOf(_isStereotypeApplied);
          }
        };
      Iterable<org.eclipse.uml2.uml.Class> _filter_1 = IterableExtensions.<org.eclipse.uml2.uml.Class>filter(_filter, _function);
      for(final org.eclipse.uml2.uml.Class infEnvelope : _filter_1) {
        _builder.append("\t");
        CharSequence _generateInfEnvelope = this.generateInfEnvelope(infEnvelope);
        _builder.append(_generateInfEnvelope, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateInfEnvelope(final org.eclipse.uml2.uml.Class umlClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("InfEnvelope \"");
    String _name = umlClass.getName();
    _builder.append(_name, "");
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      EList<Property> _attributes = umlClass.getAttributes();
      final Function1<Property,Boolean> _function = new Function1<Property,Boolean>() {
          public Boolean apply(final Property attr) {
            boolean _and = false;
            Association _association = attr.getAssociation();
            boolean _notEquals = (!Objects.equal(_association, null));
            if (!_notEquals) {
              _and = false;
            } else {
              Type _type = attr.getType();
              boolean _isStereotypeApplied = _type.isStereotypeApplied(DocLibrary2Text.this.ummStereotypes.MA.value);
              _and = (_notEquals && _isStereotypeApplied);
            }
            return Boolean.valueOf(_and);
          }
        };
      Iterable<Property> _filter = IterableExtensions.<Property>filter(_attributes, _function);
      for(final Property attr : _filter) {
        _builder.append("\t");
        Type _type = attr.getType();
        CharSequence _generateMA = ((org.eclipse.uml2.uml.Class) _type)==null?(CharSequence)null:this.generateMA(((org.eclipse.uml2.uml.Class) _type));
        _builder.append(_generateMA, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateMA(final org.eclipse.uml2.uml.Class umlClass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("MA ");
    String _name = umlClass.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    {
      EList<Property> _allAttributes = umlClass.getAllAttributes();
      final Function1<Property,Boolean> _function = new Function1<Property,Boolean>() {
          public Boolean apply(final Property attr) {
            Type _type = attr.getType();
            boolean _isStereotypeApplied = _type.isStereotypeApplied(DocLibrary2Text.this.ummStereotypes.ABIE.value);
            return Boolean.valueOf(_isStereotypeApplied);
          }
        };
      Iterable<Property> _filter = IterableExtensions.<Property>filter(_allAttributes, _function);
      for(final Property attr : _filter) {
        _builder.append("\t");
        String _prefixMAAttribute = this.prefixMAAttribute(attr);
        _builder.append(_prefixMAAttribute, "	");
        _builder.append(" ");
        String _name_1 = attr.getName();
        _builder.append(_name_1, "	");
        _builder.append(" ");
        String _multiplicity = this.multiplicity2Text.multiplicity(attr);
        _builder.append(_multiplicity, "	");
        _builder.append(" ");
        Type _type = attr.getType();
        String _name_2 = _type==null?(String)null:_type.getName();
        _builder.append(_name_2, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<Constraint> _ownedRules = umlClass.getOwnedRules();
      for(final Constraint constraint : _ownedRules) {
        _builder.append("\t");
        EList<Element> _constrainedElements = constraint.getConstrainedElements();
        Element _head = IterableExtensions.<Element>head(_constrainedElements);
        CharSequence _generatConstraint = this.constraint2Text.generatConstraint(constraint, this.ummStereotypes, ((NamedElement) _head));
        _builder.append(_generatConstraint, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String prefixMAAttribute(final Property umlProperty) {
    Association _association = umlProperty.getAssociation();
    boolean _isStereotypeApplied = _association.isStereotypeApplied(this.ummStereotypes.ASMA.value);
    if (_isStereotypeApplied) {
      return "ASMA";
    } else {
      return "    ";
    }
  }
}
