/**
 * generated by XText 2.17.0
 */
package prodest.es.gov.br.dsl.nestdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.Property#getRelation <em>Relation</em>}</li>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.Property#getName <em>Name</em>}</li>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.Property#getType <em>Type</em>}</li>
 *   <li>{@link prodest.es.gov.br.dsl.nestdsl.Property#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
{
  /**
   * Returns the value of the '<em><b>Relation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relation</em>' containment reference.
   * @see #setRelation(Relation)
   * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getProperty_Relation()
   * @model containment="true"
   * @generated
   */
  Relation getRelation();

  /**
   * Sets the value of the '{@link prodest.es.gov.br.dsl.nestdsl.Property#getRelation <em>Relation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relation</em>' containment reference.
   * @see #getRelation()
   * @generated
   */
  void setRelation(Relation value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getProperty_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link prodest.es.gov.br.dsl.nestdsl.Property#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Type)
   * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getProperty_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link prodest.es.gov.br.dsl.nestdsl.Property#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array</em>' attribute.
   * @see #setArray(String)
   * @see prodest.es.gov.br.dsl.nestdsl.NestdslPackage#getProperty_Array()
   * @model
   * @generated
   */
  String getArray();

  /**
   * Sets the value of the '{@link prodest.es.gov.br.dsl.nestdsl.Property#getArray <em>Array</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array</em>' attribute.
   * @see #getArray()
   * @generated
   */
  void setArray(String value);

} // Property
