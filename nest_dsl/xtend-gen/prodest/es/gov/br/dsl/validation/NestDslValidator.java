/**
 * generated by XText 2.18.0.M3
 */
package prodest.es.gov.br.dsl.validation;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import prodest.es.gov.br.dsl.nestdsl.Entity;
import prodest.es.gov.br.dsl.nestdsl.NestdslPackage;
import prodest.es.gov.br.dsl.nestdsl.Property;
import prodest.es.gov.br.dsl.validation.AbstractNestDslValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class NestDslValidator extends AbstractNestDslValidator {
  public void checkNameStartsWithCapital(final Entity entity) {
    boolean _isUpperCase = Character.isUpperCase(entity.getName().charAt(0));
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("O nome deve comear com letra maiscula", 
        NestdslPackage.Literals.TYPE__NAME);
    }
  }
  
  @Check
  public void checkFeatureNameIsUnique(final Property f) {
    EObject _eContainer = f.eContainer();
    Entity superEntity = ((Entity) _eContainer).getSuperType();
    while ((superEntity != null)) {
      {
        EList<Property> _properties = superEntity.getProperties();
        for (final Property other : _properties) {
          String _name = f.getName();
          String _name_1 = other.getName();
          boolean _equals = Objects.equal(_name, _name_1);
          if (_equals) {
            this.error("Nome de propriedades devem ser �nicos", 
              NestdslPackage.Literals.PROPERTY__NAME);
            return;
          }
        }
        superEntity = superEntity.getSuperType();
      }
    }
  }
}
