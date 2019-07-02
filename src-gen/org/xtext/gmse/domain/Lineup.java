/**
 * generated by Xtext 2.18.0
 */
package org.xtext.gmse.domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lineup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.gmse.domain.Lineup#getArtists <em>Artists</em>}</li>
 * </ul>
 *
 * @see org.xtext.gmse.domain.DomainPackage#getLineup()
 * @model
 * @generated
 */
public interface Lineup extends EObject
{
  /**
   * Returns the value of the '<em><b>Artists</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.gmse.domain.Artist}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artists</em>' containment reference list.
   * @see org.xtext.gmse.domain.DomainPackage#getLineup_Artists()
   * @model containment="true"
   * @generated
   */
  EList<Artist> getArtists();

} // Lineup