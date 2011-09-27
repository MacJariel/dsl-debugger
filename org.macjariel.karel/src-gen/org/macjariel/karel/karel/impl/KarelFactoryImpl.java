/**
 * <copyright>
 * </copyright>
 *
 */
package org.macjariel.karel.karel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.macjariel.karel.karel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KarelFactoryImpl extends EFactoryImpl implements KarelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KarelFactory init()
  {
    try
    {
      KarelFactory theKarelFactory = (KarelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.macjariel.org/karel/Karel"); 
      if (theKarelFactory != null)
      {
        return theKarelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new KarelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KarelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case KarelPackage.PROGRAM: return createProgram();
      case KarelPackage.INIT_SECTION: return createInitSection();
      case KarelPackage.INIT_COMMAND: return createInitCommand();
      case KarelPackage.INIT_POSITION_COMMAND: return createInitPositionCommand();
      case KarelPackage.INIT_HEADING_COMMAND: return createInitHeadingCommand();
      case KarelPackage.INIT_BOARD_SIZE_COMMAND: return createInitBoardSizeCommand();
      case KarelPackage.USER_DEFINED_COMMAND: return createUserDefinedCommand();
      case KarelPackage.MAIN: return createMain();
      case KarelPackage.STATEMENT: return createStatement();
      case KarelPackage.USER_DEFINED_COMMAND_STATEMENT: return createUserDefinedCommandStatement();
      case KarelPackage.IF_STATEMENT: return createIfStatement();
      case KarelPackage.ITERATE_STATEMENT: return createIterateStatement();
      case KarelPackage.WHILE_STATEMENT: return createWhileStatement();
      case KarelPackage.DOCUMENTATION_COMMENT: return createDocumentationComment();
      case KarelPackage.COMMAND_STATEMENT: return createCommandStatement();
      case KarelPackage.CONDITION_EXPR: return createConditionExpr();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitSection createInitSection()
  {
    InitSectionImpl initSection = new InitSectionImpl();
    return initSection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitCommand createInitCommand()
  {
    InitCommandImpl initCommand = new InitCommandImpl();
    return initCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitPositionCommand createInitPositionCommand()
  {
    InitPositionCommandImpl initPositionCommand = new InitPositionCommandImpl();
    return initPositionCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitHeadingCommand createInitHeadingCommand()
  {
    InitHeadingCommandImpl initHeadingCommand = new InitHeadingCommandImpl();
    return initHeadingCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InitBoardSizeCommand createInitBoardSizeCommand()
  {
    InitBoardSizeCommandImpl initBoardSizeCommand = new InitBoardSizeCommandImpl();
    return initBoardSizeCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserDefinedCommand createUserDefinedCommand()
  {
    UserDefinedCommandImpl userDefinedCommand = new UserDefinedCommandImpl();
    return userDefinedCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Main createMain()
  {
    MainImpl main = new MainImpl();
    return main;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserDefinedCommandStatement createUserDefinedCommandStatement()
  {
    UserDefinedCommandStatementImpl userDefinedCommandStatement = new UserDefinedCommandStatementImpl();
    return userDefinedCommandStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IterateStatement createIterateStatement()
  {
    IterateStatementImpl iterateStatement = new IterateStatementImpl();
    return iterateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhileStatement createWhileStatement()
  {
    WhileStatementImpl whileStatement = new WhileStatementImpl();
    return whileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentationComment createDocumentationComment()
  {
    DocumentationCommentImpl documentationComment = new DocumentationCommentImpl();
    return documentationComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CommandStatement createCommandStatement()
  {
    CommandStatementImpl commandStatement = new CommandStatementImpl();
    return commandStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionExpr createConditionExpr()
  {
    ConditionExprImpl conditionExpr = new ConditionExprImpl();
    return conditionExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KarelPackage getKarelPackage()
  {
    return (KarelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static KarelPackage getPackage()
  {
    return KarelPackage.eINSTANCE;
  }

} //KarelFactoryImpl
