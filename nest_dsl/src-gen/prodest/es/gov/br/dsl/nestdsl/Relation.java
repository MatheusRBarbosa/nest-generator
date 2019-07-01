/**
 * generated by XText 2.17.0
 */
package prodest.es.gov.br.dsl.nestdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.Relation#getOneArgument <em>One Argument</em>}</li>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.Relation#getMultipleArgument <em>Multiple Argument</em>}</li>
 * </ul>
 *
 * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject
{
  /**
   * Returns the value of the '<em><b>One Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>One Argument</em>' containment reference.
   * @see #setOneArgument(OneArgumentRelation)
   * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getRelation_OneArgument()
   * @model containment="true"
   * @generated
   */
  OneArgumentRelation getOneArgument();

  /**
   * Sets the value of the '{@link prodest.es.gov.br.dsl.nestdsl.Relation#getOneArgument <em>One Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>One Argument</em>' containment reference.
   * @see #getOneArgument()
   * @generated
   */
  void setOneArgument(OneArgumentRelation value);

  /**
   * Returns the value of the '<em><b>Multiple Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiple Argument</em>' containment reference.
   * @see #setMultipleArgument(MultipleArgumentRelation)
   * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getRelation_MultipleArgument()
   * @model containment="true"
   * @generated
   */
  MultipleArgumentRelation getMultipleArgument();

  /**
   * Sets the value of the '{@link prodest.es.gov.br.dsl.nestdsl.Relation#getMultipleArgument <em>Multiple Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiple Argument</em>' containment reference.
   * @see #getMultipleArgument()
   * @generated
   */
  void setMultipleArgument(MultipleArgumentRelation value);

} // Relation
