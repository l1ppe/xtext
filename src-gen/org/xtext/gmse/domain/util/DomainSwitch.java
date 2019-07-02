/**
 * generated by Xtext 2.18.0
 */
package org.xtext.gmse.domain.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.gmse.domain.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.gmse.domain.DomainPackage
 * @generated
 */
public class DomainSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DomainPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DomainPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DomainPackage.FESTIVAL:
      {
        Festival festival = (Festival)theEObject;
        T result = caseFestival(festival);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.LINEUP:
      {
        Lineup lineup = (Lineup)theEObject;
        T result = caseLineup(lineup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.ARTIST:
      {
        Artist artist = (Artist)theEObject;
        T result = caseArtist(artist);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.STAGELIST:
      {
        Stagelist stagelist = (Stagelist)theEObject;
        T result = caseStagelist(stagelist);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.STAGE:
      {
        Stage stage = (Stage)theEObject;
        T result = caseStage(stage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TIMETABLE:
      {
        Timetable timetable = (Timetable)theEObject;
        T result = caseTimetable(timetable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.TIMETABLE_ENTRY:
      {
        TimetableEntry timetableEntry = (TimetableEntry)theEObject;
        T result = caseTimetableEntry(timetableEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.FOOD_LINEUP:
      {
        FoodLineup foodLineup = (FoodLineup)theEObject;
        T result = caseFoodLineup(foodLineup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DomainPackage.FOOD:
      {
        Food food = (Food)theEObject;
        T result = caseFood(food);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Festival</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Festival</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFestival(Festival object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lineup</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lineup</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLineup(Lineup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Artist</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Artist</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArtist(Artist object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stagelist</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stagelist</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStagelist(Stagelist object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stage</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stage</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStage(Stage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timetable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timetable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimetable(Timetable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Timetable Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Timetable Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimetableEntry(TimetableEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Food Lineup</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Food Lineup</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFoodLineup(FoodLineup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Food</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Food</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFood(Food object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DomainSwitch