// $ANTLR 3.4 AadlBa.g 2012-04-05 11:00:15
 
  package fr.tpt.aadl.annex.behavior.parser;
  
  //import org.antlr.runtime;
  
  import org.eclipse.emf.common.util.BasicEList ;

  import org.antlr.runtime.BaseRecognizer;
  import org.antlr.runtime.BitSet;
  import org.antlr.runtime.DFA;
  import org.antlr.runtime.EarlyExitException;
  import org.antlr.runtime.FailedPredicateException;
  import org.antlr.runtime.MismatchedNotSetException;
  import org.antlr.runtime.MismatchedRangeException;
  import org.antlr.runtime.MismatchedSetException;
  import org.antlr.runtime.MismatchedTokenException;
  import org.antlr.runtime.MismatchedTreeNodeException;
  import org.antlr.runtime.NoViableAltException;
  import org.antlr.runtime.Parser;
  import org.antlr.runtime.RecognitionException;
  import org.antlr.runtime.Token;
  import org.antlr.runtime.TokenStream;
  
  import org.eclipse.emf.common.util.EList;

  import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;  
  
  import org.osate.aadl2.parsesupport.AObject;
  import org.osate.aadl2.parsesupport.LocationReference;
  
  import fr.tpt.aadl.annex.behavior.aadlba.*;
  import fr.tpt.aadl.annex.behavior.declarative.* ;
  import fr.tpt.aadl.annex.behavior.analyzers.DeclarativeUtils ;
  
  import org.osate.aadl2.Element ;
  import org.osate.aadl2.Aadl2Package ;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify 
 * it under the terms of the Eclipse Public License as published by Eclipse,
 * either version 1.0 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * Eclipse Public License for more details.
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see 
 * http://www.eclipse.org/org/documents/epl-v10.php
 */
@SuppressWarnings({"all", "warnings", "unchecked"})
public class AadlBaParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS", "AND", "ANY", "ASSIGN", "BASE", "BASED_INTEGER", "CATCH", "COLON", "COMMA", "COMPLETE", "COMPUTATION", "CONCAT", "COUNT", "DIGIT", "DISPATCH", "DIVIDE", "DO", "DOT", "DOTDOT", "DOUBLECOLON", "ELSE", "ELSIF", "END", "ENUMERATOR", "EQUAL", "ESC", "EXCLAM", "EXCLGREATER", "EXCLLESS", "EXPONENT", "EXTENDED_DIGIT", "FALSE", "FINAL", "FOR", "FORALL", "FRESH", "FROZEN", "GGREATER", "GREATEROREQUAL", "GREATERTHAN", "HASH", "HEX_DIGIT", "IDENT", "IF", "IN", "INITIAL", "INTEGER_LIT", "INTERROG", "INT_EXPONENT", "LBRACK", "LCURLY", "LESSOREQUAL", "LESSTHAN", "LETTER", "LPAREN", "LTRANS", "MINUS", "MOD", "NOT", "NOTEQUAL", "ON", "OR", "OTHERWISE", "PLUS", "RBRACK", "RCURLY", "REAL_LIT", "REM", "RPAREN", "RTRANS", "SEMICOLON", "SL_COMMENT", "STAR", "STARSTAR", "STATE", "STATES", "STOP", "STRING_LITERAL", "TICK", "TIMEOUT", "TRANSITIONS", "TRUE", "UNTIL", "VARIABLES", "WHILE", "WS", "XOR"
    };

    public static final int EOF=-1;
    public static final int ABS=4;
    public static final int AND=5;
    public static final int ANY=6;
    public static final int ASSIGN=7;
    public static final int BASE=8;
    public static final int BASED_INTEGER=9;
    public static final int CATCH=10;
    public static final int COLON=11;
    public static final int COMMA=12;
    public static final int COMPLETE=13;
    public static final int COMPUTATION=14;
    public static final int CONCAT=15;
    public static final int COUNT=16;
    public static final int DIGIT=17;
    public static final int DISPATCH=18;
    public static final int DIVIDE=19;
    public static final int DO=20;
    public static final int DOT=21;
    public static final int DOTDOT=22;
    public static final int DOUBLECOLON=23;
    public static final int ELSE=24;
    public static final int ELSIF=25;
    public static final int END=26;
    public static final int ENUMERATOR=27;
    public static final int EQUAL=28;
    public static final int ESC=29;
    public static final int EXCLAM=30;
    public static final int EXCLGREATER=31;
    public static final int EXCLLESS=32;
    public static final int EXPONENT=33;
    public static final int EXTENDED_DIGIT=34;
    public static final int FALSE=35;
    public static final int FINAL=36;
    public static final int FOR=37;
    public static final int FORALL=38;
    public static final int FRESH=39;
    public static final int FROZEN=40;
    public static final int GGREATER=41;
    public static final int GREATEROREQUAL=42;
    public static final int GREATERTHAN=43;
    public static final int HASH=44;
    public static final int HEX_DIGIT=45;
    public static final int IDENT=46;
    public static final int IF=47;
    public static final int IN=48;
    public static final int INITIAL=49;
    public static final int INTEGER_LIT=50;
    public static final int INTERROG=51;
    public static final int INT_EXPONENT=52;
    public static final int LBRACK=53;
    public static final int LCURLY=54;
    public static final int LESSOREQUAL=55;
    public static final int LESSTHAN=56;
    public static final int LETTER=57;
    public static final int LPAREN=58;
    public static final int LTRANS=59;
    public static final int MINUS=60;
    public static final int MOD=61;
    public static final int NOT=62;
    public static final int NOTEQUAL=63;
    public static final int ON=64;
    public static final int OR=65;
    public static final int OTHERWISE=66;
    public static final int PLUS=67;
    public static final int RBRACK=68;
    public static final int RCURLY=69;
    public static final int REAL_LIT=70;
    public static final int REM=71;
    public static final int RPAREN=72;
    public static final int RTRANS=73;
    public static final int SEMICOLON=74;
    public static final int SL_COMMENT=75;
    public static final int STAR=76;
    public static final int STARSTAR=77;
    public static final int STATE=78;
    public static final int STATES=79;
    public static final int STOP=80;
    public static final int STRING_LITERAL=81;
    public static final int TICK=82;
    public static final int TIMEOUT=83;
    public static final int TRANSITIONS=84;
    public static final int TRUE=85;
    public static final int UNTIL=86;
    public static final int VARIABLES=87;
    public static final int WHILE=88;
    public static final int WS=89;
    public static final int XOR=90;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AadlBaParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AadlBaParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return AadlBaParser.tokenNames; }
    public String getGrammarFileName() { return "AadlBa.g"; }


      /**
      * Aadl Ba metamodel factory.
      */
      protected AadlBaFactory _fact = AadlBaFactory.eINSTANCE ;
      
      protected DeclarativeFactory _decl = DeclarativeFactory.eINSTANCE ;
      

      /**
       * The error reporter to use.
       */
      protected ParseErrorReporter errReporter = null;
      
      /**
       * The aadl filename to be parsed.
       */
      private String filename;
      
      /**
       * Set the error reporter to use.
       */
       
      public void setParseErrorReporter(final ParseErrorReporter reporter) {
          errReporter = reporter;
      }
      
      public void setFilename(String fn){
        filename=fn;
      }
      
      public String getFilename(){
        return filename;
      }
    /*  
      public void nameCopy(Name src, Name dest)
      {
        dest.setLocationReference(src.getLocationReference());
        dest.setIdentifierOwned(src.getIdentifierOwned());
        dest.getArrayIndexes().addAll(src.getArrayIndexes());
      }
    */  
      /**
       * Reports a parser error.
       * @param e  antlr error exception 
       */
      public  void reportError(RecognitionException e)  {
            String description=null;
            if (e instanceof MismatchedTokenException){
              MismatchedTokenException mte = (MismatchedTokenException) e;
              if (mte.expecting != -1)
                description = "Expecting: "+tokenNames[mte.expecting]+", found: "+mte.token.getText();
              else
                description = "Unexpected token '"+mte.token.getText()+"'";
            } else if (e instanceof MismatchedTreeNodeException){
              description = "Unexpected Tree Node Exception";
            } else if (e instanceof NoViableAltException){
              NoViableAltException nva = (NoViableAltException) e;
              description = "No viable alternative: "+nva.grammarDecisionDescription;
            } else if (e instanceof EarlyExitException){
              EarlyExitException ee = (EarlyExitException) e;
              description = "Early Exit";
            } else if (e instanceof FailedPredicateException){
              FailedPredicateException fp = (FailedPredicateException)e;
              description = "Semantic error: "+fp.predicateText;
            } else if (e instanceof MismatchedRangeException){
              MismatchedRangeException mr = (MismatchedRangeException)e;
              description = "Mismatched range: ";
            } else if (e instanceof MismatchedSetException){
              MismatchedSetException ms = (MismatchedSetException)e;
              description = "Mismatched set";
            } else if (e instanceof MismatchedNotSetException){
              description="Mismatched of inverse of a set";
            } 
            description += " at line " + e.line + " col " + e.charPositionInLine ;
            errReporter.error(this.getFilename(), e.line, description);
            e.printStackTrace();
            System.err.println(e.getMessage());
      }

      /**
       * Reports parser error.
       * @param e  any exception 
       */
      public  void reportError(Exception e) {
        //AadlParserPlugin.INSTANCE.log(e);
        errReporter.error(this.getFilename(), 0, e.toString());
      }

      /**
       * Sets obj's location reference based on full token informations.
       *
       * @param obj the AObject to be set
       * @param src the token 
       */ 
      private void setLocationReference(AObject obj, Token src){
        
        String description = "file " + this.getFilename() + " col " + src.getCharPositionInLine() ;
        
        obj.setLocationReference(new LocationReference(description, src.getLine()));
      
      }
      
      private BehaviorAnnex _ba = null ;



    // $ANTLR start "behavior_annex"
    // AadlBa.g:362:1: behavior_annex returns [BehaviorAnnex BehAnnex] : ( VARIABLES (lbv= behavior_variable_list[BehAnnex] )+ )? ( STATES (lbs= behavior_state_list )+ )? ( TRANSITIONS (BehTrans= behavior_transition )+ )? ;
    public final BehaviorAnnex behavior_annex() throws RecognitionException {
        BehaviorAnnex BehAnnex = null;


        List<BehaviorVariable> lbv =null;

        List<BehaviorState> lbs =null;

        DeclarativeBehaviorTransition BehTrans =null;



           BehAnnex = _fact.createBehaviorAnnex();
           _ba = BehAnnex ;
           BehAnnex.setLocationReference(new LocationReference(this.getFilename(), input.get(0).getLine())) ; 
              
         
        try {
            // AadlBa.g:369:3: ( ( VARIABLES (lbv= behavior_variable_list[BehAnnex] )+ )? ( STATES (lbs= behavior_state_list )+ )? ( TRANSITIONS (BehTrans= behavior_transition )+ )? )
            // AadlBa.g:370:4: ( VARIABLES (lbv= behavior_variable_list[BehAnnex] )+ )? ( STATES (lbs= behavior_state_list )+ )? ( TRANSITIONS (BehTrans= behavior_transition )+ )?
            {
            // AadlBa.g:370:4: ( VARIABLES (lbv= behavior_variable_list[BehAnnex] )+ )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==VARIABLES) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // AadlBa.g:370:6: VARIABLES (lbv= behavior_variable_list[BehAnnex] )+
                    {
                    match(input,VARIABLES,FOLLOW_VARIABLES_in_behavior_annex1208); if (state.failed) return BehAnnex;

                    // AadlBa.g:371:8: (lbv= behavior_variable_list[BehAnnex] )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==IDENT) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // AadlBa.g:371:10: lbv= behavior_variable_list[BehAnnex]
                    	    {
                    	    pushFollow(FOLLOW_behavior_variable_list_in_behavior_annex1221);
                    	    lbv=behavior_variable_list(BehAnnex);

                    	    state._fsp--;
                    	    if (state.failed) return BehAnnex;

                    	    if ( state.backtracking==0 ) { BehAnnex.getVariables().addAll(lbv);}

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                    	    if (state.backtracking>0) {state.failed=true; return BehAnnex;}
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;

            }


            // AadlBa.g:374:4: ( STATES (lbs= behavior_state_list )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==STATES) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // AadlBa.g:374:6: STATES (lbs= behavior_state_list )+
                    {
                    match(input,STATES,FOLLOW_STATES_in_behavior_annex1244); if (state.failed) return BehAnnex;

                    // AadlBa.g:375:8: (lbs= behavior_state_list )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==IDENT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // AadlBa.g:375:10: lbs= behavior_state_list
                    	    {
                    	    pushFollow(FOLLOW_behavior_state_list_in_behavior_annex1257);
                    	    lbs=behavior_state_list();

                    	    state._fsp--;
                    	    if (state.failed) return BehAnnex;

                    	    if ( state.backtracking==0 ) { BehAnnex.getStates().addAll(lbs); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                    	    if (state.backtracking>0) {state.failed=true; return BehAnnex;}
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            // AadlBa.g:378:4: ( TRANSITIONS (BehTrans= behavior_transition )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TRANSITIONS) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // AadlBa.g:378:6: TRANSITIONS (BehTrans= behavior_transition )+
                    {
                    match(input,TRANSITIONS,FOLLOW_TRANSITIONS_in_behavior_annex1279); if (state.failed) return BehAnnex;

                    // AadlBa.g:379:8: (BehTrans= behavior_transition )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==IDENT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // AadlBa.g:379:10: BehTrans= behavior_transition
                    	    {
                    	    pushFollow(FOLLOW_behavior_transition_in_behavior_annex1293);
                    	    BehTrans=behavior_transition();

                    	    state._fsp--;
                    	    if (state.failed) return BehAnnex;

                    	    if ( state.backtracking==0 ) {BehAnnex.getTransitions().add(BehTrans); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                    	    if (state.backtracking>0) {state.failed=true; return BehAnnex;}
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehAnnex;
    }
    // $ANTLR end "behavior_annex"



    // $ANTLR start "behavior_variable_list"
    // AadlBa.g:391:1: behavior_variable_list[BehaviorAnnex ba] returns [List<BehaviorVariable> lbv] : bv= behavior_variable ( COMMA bv= behavior_variable )* COLON DataClassRef= unique_component_classifier_reference SEMICOLON ;
    public final List<BehaviorVariable> behavior_variable_list(BehaviorAnnex ba) throws RecognitionException {
        List<BehaviorVariable> lbv = null;


        BehaviorVariable bv =null;

        QualifiedNamedElement DataClassRef =null;



           lbv = new ArrayList<BehaviorVariable>() ;
         
        try {
            // AadlBa.g:395:3: (bv= behavior_variable ( COMMA bv= behavior_variable )* COLON DataClassRef= unique_component_classifier_reference SEMICOLON )
            // AadlBa.g:397:4: bv= behavior_variable ( COMMA bv= behavior_variable )* COLON DataClassRef= unique_component_classifier_reference SEMICOLON
            {
            pushFollow(FOLLOW_behavior_variable_in_behavior_variable_list1348);
            bv=behavior_variable();

            state._fsp--;
            if (state.failed) return lbv;

            if ( state.backtracking==0 ) {
                 lbv.add(bv) ;
               }

            // AadlBa.g:402:4: ( COMMA bv= behavior_variable )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COMMA) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // AadlBa.g:402:6: COMMA bv= behavior_variable
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_behavior_variable_list1365); if (state.failed) return lbv;

            	    pushFollow(FOLLOW_behavior_variable_in_behavior_variable_list1369);
            	    bv=behavior_variable();

            	    state._fsp--;
            	    if (state.failed) return lbv;

            	    if ( state.backtracking==0 ) {
            	           lbv.add(bv) ;
            	         }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match(input,COLON,FOLLOW_COLON_in_behavior_variable_list1392); if (state.failed) return lbv;

            pushFollow(FOLLOW_unique_component_classifier_reference_in_behavior_variable_list1404);
            DataClassRef=unique_component_classifier_reference();

            state._fsp--;
            if (state.failed) return lbv;

            if ( state.backtracking==0 ) {
                  DeclarativeUtils.setEcontainer(_ba, DataClassRef);
                  
                  for(BehaviorVariable tmp : lbv)
                  {
                    tmp.setDataClassifier(DataClassRef);
                  }
               }

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behavior_variable_list1414); if (state.failed) return lbv;

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return lbv;
    }
    // $ANTLR end "behavior_variable_list"



    // $ANTLR start "behavior_variable"
    // AadlBa.g:430:1: behavior_variable returns [BehaviorVariable bv] : identifier= IDENT ( LBRACK IntValue= integer_value_constant RBRACK )* ;
    public final BehaviorVariable behavior_variable() throws RecognitionException {
        BehaviorVariable bv = null;


        Token identifier=null;
        IntegerValueConstant IntValue =null;



           bv = _fact.createBehaviorVariable();
         
        try {
            // AadlBa.g:435:3: (identifier= IDENT ( LBRACK IntValue= integer_value_constant RBRACK )* )
            // AadlBa.g:436:5: identifier= IDENT ( LBRACK IntValue= integer_value_constant RBRACK )*
            {
            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_variable1450); if (state.failed) return bv;

            if ( state.backtracking==0 ) { 
                                   setLocationReference(bv, identifier);
                                   bv.setName(identifier.getText()) ;
                                 }

            // AadlBa.g:440:5: ( LBRACK IntValue= integer_value_constant RBRACK )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LBRACK) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // AadlBa.g:440:7: LBRACK IntValue= integer_value_constant RBRACK
            	    {
            	    match(input,LBRACK,FOLLOW_LBRACK_in_behavior_variable1460); if (state.failed) return bv;

            	    pushFollow(FOLLOW_integer_value_constant_in_behavior_variable1464);
            	    IntValue=integer_value_constant();

            	    state._fsp--;
            	    if (state.failed) return bv;

            	    match(input,RBRACK,FOLLOW_RBRACK_in_behavior_variable1466); if (state.failed) return bv;

            	    if ( state.backtracking==0 ) { 
            	            DeclarativeArrayDimension dad = _decl.createDeclarativeArrayDimension();
            	            dad.setLocationReference(IntValue.getLocationReference()) ;
            	            dad.setDimension(IntValue) ;
            	            bv.getArrayDimensions().add(dad); 
            	          }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return bv;
    }
    // $ANTLR end "behavior_variable"



    // $ANTLR start "declarator"
    // AadlBa.g:457:1: declarator returns [ArrayableIdentifier id] : identifier= IDENT ( LBRACK IntValue= integer_value_constant RBRACK )* ;
    public final ArrayableIdentifier declarator() throws RecognitionException {
        ArrayableIdentifier id = null;


        Token identifier=null;
        IntegerValueConstant IntValue =null;



           id = _decl.createArrayableIdentifier();
         
        try {
            // AadlBa.g:462:3: (identifier= IDENT ( LBRACK IntValue= integer_value_constant RBRACK )* )
            // AadlBa.g:463:5: identifier= IDENT ( LBRACK IntValue= integer_value_constant RBRACK )*
            {
            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_declarator1517); if (state.failed) return id;

            if ( state.backtracking==0 ) { 
                                   id.setId(identifier.getText());
                                   setLocationReference(id, identifier);
                                 }

            // AadlBa.g:467:5: ( LBRACK IntValue= integer_value_constant RBRACK )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==LBRACK) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // AadlBa.g:467:7: LBRACK IntValue= integer_value_constant RBRACK
            	    {
            	    match(input,LBRACK,FOLLOW_LBRACK_in_declarator1527); if (state.failed) return id;

            	    pushFollow(FOLLOW_integer_value_constant_in_declarator1531);
            	    IntValue=integer_value_constant();

            	    state._fsp--;
            	    if (state.failed) return id;

            	    match(input,RBRACK,FOLLOW_RBRACK_in_declarator1533); if (state.failed) return id;

            	    if ( state.backtracking==0 ) { 
            	            id.getArrayIndexes().add(IntValue); 
            	          }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return id;
    }
    // $ANTLR end "declarator"



    // $ANTLR start "qualifiable_named_element"
    // AadlBa.g:483:1: qualifiable_named_element[QualifiedNamedElement qne] : ( (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )? ) ;
    public final void qualifiable_named_element(QualifiedNamedElement qne) throws RecognitionException {
        Token identifier1=null;
        Token identifier2=null;
        Token identifier3=null;


                String id1 = "";
                String id2 = "";
              
        try {
            // AadlBa.g:488:3: ( ( (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )? ) )
            // AadlBa.g:489:4: ( (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )? )
            {
            // AadlBa.g:489:4: ( (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )? )
            // AadlBa.g:490:5: (identifier1= IDENT DOUBLECOLON )* identifier2= IDENT ( DOT identifier3= IDENT )?
            {
            // AadlBa.g:490:5: (identifier1= IDENT DOUBLECOLON )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==IDENT) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==DOUBLECOLON) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // AadlBa.g:490:7: identifier1= IDENT DOUBLECOLON
            	    {
            	    identifier1=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiable_named_element1589); if (state.failed) return ;

            	    match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_qualifiable_named_element1591); if (state.failed) return ;

            	    if ( state.backtracking==0 ) { id1=id1+(id1.length() == 0 ? "":"::")+identifier1.getText(); }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            identifier2=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiable_named_element1606); if (state.failed) return ;

            if ( state.backtracking==0 ) { id2=identifier2.getText(); }

            // AadlBa.g:492:5: ( DOT identifier3= IDENT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DOT) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==IDENT) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // AadlBa.g:492:7: DOT identifier3= IDENT
                    {
                    match(input,DOT,FOLLOW_DOT_in_qualifiable_named_element1616); if (state.failed) return ;

                    identifier3=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualifiable_named_element1620); if (state.failed) return ;

                    if ( state.backtracking==0 ) { id2=id2+"."+identifier3.getText(); }

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
                 Identifier nameId = _decl.createIdentifier();
                 nameId.setId(id2);
                 setLocationReference(nameId, identifier2); 
                 qne.setBaName(nameId);
                
                 if (! id1.equals(""))
                 {
                   Identifier nameSpaceId = _decl.createIdentifier();
                   nameSpaceId.setId(id1);
                   setLocationReference(nameSpaceId, identifier1); 
                   qne.setBaNamespace(nameSpaceId);
                   setLocationReference(qne, identifier1);
                 }
                 else
                 {
                   setLocationReference(qne, identifier2);
                 }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "qualifiable_named_element"



    // $ANTLR start "unique_component_classifier_reference"
    // AadlBa.g:523:1: unique_component_classifier_reference returns [QualifiedNamedElement DataClassRef] : ( qualifiable_named_element[DataClassRef] ) ;
    public final QualifiedNamedElement unique_component_classifier_reference() throws RecognitionException {
        QualifiedNamedElement DataClassRef = null;



           DataClassRef = _decl.createQualifiedNamedElement();
         
        try {
            // AadlBa.g:527:3: ( ( qualifiable_named_element[DataClassRef] ) )
            // AadlBa.g:528:4: ( qualifiable_named_element[DataClassRef] )
            {
            // AadlBa.g:528:4: ( qualifiable_named_element[DataClassRef] )
            // AadlBa.g:529:6: qualifiable_named_element[DataClassRef]
            {
            pushFollow(FOLLOW_qualifiable_named_element_in_unique_component_classifier_reference1676);
            qualifiable_named_element(DataClassRef);

            state._fsp--;
            if (state.failed) return DataClassRef;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DataClassRef;
    }
    // $ANTLR end "unique_component_classifier_reference"



    // $ANTLR start "behavior_state_list"
    // AadlBa.g:545:1: behavior_state_list returns [List<BehaviorState> lbs] : identifier= IDENT ( COMMA identifier= IDENT )* COLON ( ( INITIAL )? ( COMPLETE )? ( FINAL )? ) STATE SEMICOLON ;
    public final List<BehaviorState> behavior_state_list() throws RecognitionException {
        List<BehaviorState> lbs = null;


        Token identifier=null;


           lbs = new ArrayList<BehaviorState>() ;
         
        try {
            // AadlBa.g:549:3: (identifier= IDENT ( COMMA identifier= IDENT )* COLON ( ( INITIAL )? ( COMPLETE )? ( FINAL )? ) STATE SEMICOLON )
            // AadlBa.g:550:5: identifier= IDENT ( COMMA identifier= IDENT )* COLON ( ( INITIAL )? ( COMPLETE )? ( FINAL )? ) STATE SEMICOLON
            {
            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_state_list1721); if (state.failed) return lbs;

            if ( state.backtracking==0 ) {
                    BehaviorState bs = _fact.createBehaviorState() ;
                    bs.setName(identifier.getText());
                    setLocationReference(bs, identifier); 
                    lbs.add(bs) ; 
                  }

            // AadlBa.g:557:4: ( COMMA identifier= IDENT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // AadlBa.g:557:6: COMMA identifier= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_behavior_state_list1737); if (state.failed) return lbs;

            	    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_state_list1741); if (state.failed) return lbs;

            	    if ( state.backtracking==0 ) {
            	            BehaviorState bs = _fact.createBehaviorState() ;
            	            bs.setName(identifier.getText());
            	            setLocationReference(bs, identifier); 
            	            lbs.add(bs) ; 
            	         }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            match(input,COLON,FOLLOW_COLON_in_behavior_state_list1761); if (state.failed) return lbs;

            // AadlBa.g:566:4: ( ( INITIAL )? ( COMPLETE )? ( FINAL )? )
            // AadlBa.g:567:6: ( INITIAL )? ( COMPLETE )? ( FINAL )?
            {
            // AadlBa.g:567:6: ( INITIAL )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==INITIAL) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // AadlBa.g:567:7: INITIAL
                    {
                    match(input,INITIAL,FOLLOW_INITIAL_in_behavior_state_list1775); if (state.failed) return lbs;

                    if ( state.backtracking==0 ) { 
                                     for (BehaviorState bs : lbs)
                                     {
                                       bs.setInitial(true)  ;
                                     } 
                                   }

                    }
                    break;

            }


            // AadlBa.g:573:6: ( COMPLETE )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COMPLETE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // AadlBa.g:573:7: COMPLETE
                    {
                    match(input,COMPLETE,FOLLOW_COMPLETE_in_behavior_state_list1790); if (state.failed) return lbs;

                    if ( state.backtracking==0 ) { 
                                     for (BehaviorState bs : lbs)
                                     {
                                       bs.setComplete(true)  ;
                                     } 
                                   }

                    }
                    break;

            }


            // AadlBa.g:579:6: ( FINAL )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==FINAL) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // AadlBa.g:579:7: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_behavior_state_list1804); if (state.failed) return lbs;

                    if ( state.backtracking==0 ) { 
                                     for (BehaviorState bs : lbs)
                                     {
                                       bs.setFinal(true)  ;
                                     } 
                                   }

                    }
                    break;

            }


            }


            match(input,STATE,FOLLOW_STATE_in_behavior_state_list1823); if (state.failed) return lbs;

            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behavior_state_list1825); if (state.failed) return lbs;

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return lbs;
    }
    // $ANTLR end "behavior_state_list"



    // $ANTLR start "behavior_transition"
    // AadlBa.g:602:1: behavior_transition returns [DeclarativeBehaviorTransition BehTrans] : (identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON )? identifier= IDENT ( COMMA identifier= IDENT )* (identifier= LTRANS BehCond= behavior_condition RTRANS ) identifier= IDENT (BehActionBlock= behavior_action_block )? SEMICOLON ;
    public final DeclarativeBehaviorTransition behavior_transition() throws RecognitionException {
        DeclarativeBehaviorTransition BehTrans = null;


        Token identifier=null;
        Integer Num =null;

        BehaviorCondition BehCond =null;

        BehaviorActionBlock BehActionBlock =null;



           BehTrans = _decl.createDeclarativeBehaviorTransition();
         
        try {
            // AadlBa.g:607:3: ( (identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON )? identifier= IDENT ( COMMA identifier= IDENT )* (identifier= LTRANS BehCond= behavior_condition RTRANS ) identifier= IDENT (BehActionBlock= behavior_action_block )? SEMICOLON )
            // AadlBa.g:608:4: (identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON )? identifier= IDENT ( COMMA identifier= IDENT )* (identifier= LTRANS BehCond= behavior_condition RTRANS ) identifier= IDENT (BehActionBlock= behavior_action_block )? SEMICOLON
            {
            // AadlBa.g:608:4: (identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENT) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==COLON||LA17_1==LBRACK) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // AadlBa.g:608:6: identifier= IDENT ( LBRACK Num= numeral RBRACK )? COLON
                    {
                    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_transition1868); if (state.failed) return BehTrans;

                    if ( state.backtracking==0 ) {
                           BehTrans.setName(identifier.getText()) ;
                           setLocationReference(BehTrans, identifier); 
                         }

                    // AadlBa.g:613:6: ( LBRACK Num= numeral RBRACK )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==LBRACK) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // AadlBa.g:613:8: LBRACK Num= numeral RBRACK
                            {
                            match(input,LBRACK,FOLLOW_LBRACK_in_behavior_transition1886); if (state.failed) return BehTrans;

                            pushFollow(FOLLOW_numeral_in_behavior_transition1890);
                            Num=numeral();

                            state._fsp--;
                            if (state.failed) return BehTrans;

                            match(input,RBRACK,FOLLOW_RBRACK_in_behavior_transition1892); if (state.failed) return BehTrans;

                            if ( state.backtracking==0 ) { BehTrans.setPriority(Num);}

                            }
                            break;

                    }


                    match(input,COLON,FOLLOW_COLON_in_behavior_transition1905); if (state.failed) return BehTrans;

                    }
                    break;

            }


            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_transition1924); if (state.failed) return BehTrans;

            if ( state.backtracking==0 ) { 
                 Identifier Id = _decl.createIdentifier();
                 Id.setId(identifier.getText());
                 setLocationReference(Id, identifier); 
                 BehTrans.getSrcStates().add(Id);
                
                 if(BehTrans.getLocationReference() == null)
                 {
                   BehTrans.setLocationReference(Id.getLocationReference()) ;
                 } 
               }

            // AadlBa.g:630:4: ( COMMA identifier= IDENT )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==COMMA) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // AadlBa.g:630:6: COMMA identifier= IDENT
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_behavior_transition1941); if (state.failed) return BehTrans;

            	    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_transition1945); if (state.failed) return BehTrans;

            	    if ( state.backtracking==0 ) { 
            	          Identifier Id = _decl.createIdentifier();
            	          Id.setId(identifier.getText());
            	          setLocationReference(Id, identifier); 
            	          BehTrans.getSrcStates().add(Id);
            	         }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // AadlBa.g:639:4: (identifier= LTRANS BehCond= behavior_condition RTRANS )
            // AadlBa.g:639:6: identifier= LTRANS BehCond= behavior_condition RTRANS
            {
            identifier=(Token)match(input,LTRANS,FOLLOW_LTRANS_in_behavior_transition1973); if (state.failed) return BehTrans;

            pushFollow(FOLLOW_behavior_condition_in_behavior_transition1977);
            BehCond=behavior_condition();

            state._fsp--;
            if (state.failed) return BehTrans;

            if ( state.backtracking==0 ) { 
                   // behavior condition can be null.
                   if (BehCond != null)
                   {
                     DeclarativeUtils.setEcontainer(_ba, BehCond);
                     BehTrans.setCondition(BehCond);
                   }
                 }

            match(input,RTRANS,FOLLOW_RTRANS_in_behavior_transition1992); if (state.failed) return BehTrans;

            }


            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_transition2009); if (state.failed) return BehTrans;

            if ( state.backtracking==0 ) {
                 Identifier Id = _decl.createIdentifier();
                 Id.setId(identifier.getText());
                 setLocationReference(Id, identifier); 
                 BehTrans.setDestState(Id);
               }

            // AadlBa.g:659:4: (BehActionBlock= behavior_action_block )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LCURLY) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // AadlBa.g:659:6: BehActionBlock= behavior_action_block
                    {
                    pushFollow(FOLLOW_behavior_action_block_in_behavior_transition2029);
                    BehActionBlock=behavior_action_block();

                    state._fsp--;
                    if (state.failed) return BehTrans;

                    if ( state.backtracking==0 ) { 
                              DeclarativeUtils.setEcontainer(_ba, BehActionBlock);
                              BehTrans.setActionBlock(BehActionBlock);
                            }

                    }
                    break;

            }


            match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behavior_transition2060); if (state.failed) return BehTrans;

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehTrans;
    }
    // $ANTLR end "behavior_transition"



    // $ANTLR start "behavior_action_block"
    // AadlBa.g:676:1: behavior_action_block returns [BehaviorActionBlock BehActionBlock] : identifier= LCURLY BehActions= behavior_actions RCURLY ( TIMEOUT BehTime= behavior_time )? ;
    public final BehaviorActionBlock behavior_action_block() throws RecognitionException {
        BehaviorActionBlock BehActionBlock = null;


        Token identifier=null;
        BehaviorActions BehActions =null;

        DeclarativeTime BehTime =null;



                 BehActionBlock = _fact.createBehaviorActionBlock() ;
         
        try {
            // AadlBa.g:680:3: (identifier= LCURLY BehActions= behavior_actions RCURLY ( TIMEOUT BehTime= behavior_time )? )
            // AadlBa.g:680:5: identifier= LCURLY BehActions= behavior_actions RCURLY ( TIMEOUT BehTime= behavior_time )?
            {
            identifier=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_behavior_action_block2090); if (state.failed) return BehActionBlock;

            pushFollow(FOLLOW_behavior_actions_in_behavior_action_block2094);
            BehActions=behavior_actions();

            state._fsp--;
            if (state.failed) return BehActionBlock;

            match(input,RCURLY,FOLLOW_RCURLY_in_behavior_action_block2096); if (state.failed) return BehActionBlock;

            if ( state.backtracking==0 ) {
                   BehActionBlock.setContent(BehActions) ;
                   setLocationReference(BehActionBlock, identifier);
                }

            // AadlBa.g:686:5: ( TIMEOUT BehTime= behavior_time )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==TIMEOUT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // AadlBa.g:686:7: TIMEOUT BehTime= behavior_time
                    {
                    match(input,TIMEOUT,FOLLOW_TIMEOUT_in_behavior_action_block2118); if (state.failed) return BehActionBlock;

                    pushFollow(FOLLOW_behavior_time_in_behavior_action_block2122);
                    BehTime=behavior_time();

                    state._fsp--;
                    if (state.failed) return BehActionBlock;

                    if ( state.backtracking==0 ) {
                            BehActionBlock.setTimeout(BehTime) ;
                          }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehActionBlock;
    }
    // $ANTLR end "behavior_action_block"



    // $ANTLR start "behavior_condition"
    // AadlBa.g:701:1: behavior_condition returns [BehaviorCondition BehCond] : (pos= ON DisCond= dispatch_condition | (ExecCond= execute_condition )? ) ;
    public final BehaviorCondition behavior_condition() throws RecognitionException {
        BehaviorCondition BehCond = null;


        Token pos=null;
        DispatchCondition DisCond =null;

        ExecuteCondition ExecCond =null;



         
        try {
            // AadlBa.g:704:3: ( (pos= ON DisCond= dispatch_condition | (ExecCond= execute_condition )? ) )
            // AadlBa.g:705:4: (pos= ON DisCond= dispatch_condition | (ExecCond= execute_condition )? )
            {
            // AadlBa.g:705:4: (pos= ON DisCond= dispatch_condition | (ExecCond= execute_condition )? )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ON) ) {
                alt22=1;
            }
            else if ( (LA22_0==ABS||LA22_0==FALSE||LA22_0==IDENT||LA22_0==INTEGER_LIT||LA22_0==LPAREN||LA22_0==MINUS||LA22_0==NOT||(LA22_0 >= OTHERWISE && LA22_0 <= PLUS)||LA22_0==REAL_LIT||LA22_0==RTRANS||LA22_0==STRING_LITERAL||LA22_0==TIMEOUT||LA22_0==TRUE) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return BehCond;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // AadlBa.g:706:8: pos= ON DisCond= dispatch_condition
                    {
                    pos=(Token)match(input,ON,FOLLOW_ON_in_behavior_condition2180); if (state.failed) return BehCond;

                    pushFollow(FOLLOW_dispatch_condition_in_behavior_condition2184);
                    DisCond=dispatch_condition();

                    state._fsp--;
                    if (state.failed) return BehCond;

                    if ( state.backtracking==0 ) {
                             setLocationReference(DisCond, pos);
                           }

                    }
                    break;
                case 2 :
                    // AadlBa.g:711:8: (ExecCond= execute_condition )?
                    {
                    // AadlBa.g:711:8: (ExecCond= execute_condition )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==ABS||LA21_0==FALSE||LA21_0==IDENT||LA21_0==INTEGER_LIT||LA21_0==LPAREN||LA21_0==MINUS||LA21_0==NOT||(LA21_0 >= OTHERWISE && LA21_0 <= PLUS)||LA21_0==REAL_LIT||LA21_0==STRING_LITERAL||LA21_0==TIMEOUT||LA21_0==TRUE) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // AadlBa.g:711:9: ExecCond= execute_condition
                            {
                            pushFollow(FOLLOW_execute_condition_in_behavior_condition2212);
                            ExecCond=execute_condition();

                            state._fsp--;
                            if (state.failed) return BehCond;

                            }
                            break;

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                 if (DisCond != null)
                 {
                   BehCond = DisCond;
                 } 
                 else
                 {
                   BehCond = ExecCond;
                 }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehCond;
    }
    // $ANTLR end "behavior_condition"



    // $ANTLR start "execute_condition"
    // AadlBa.g:740:1: execute_condition returns [ExecuteCondition ExecCond] : (identifier= TIMEOUT |identifier= OTHERWISE |ValExpr= value_expression ) ;
    public final ExecuteCondition execute_condition() throws RecognitionException {
        ExecuteCondition ExecCond = null;


        Token identifier=null;
        ValueExpression ValExpr =null;



            ExecCond= null ;
         
        try {
            // AadlBa.g:745:3: ( (identifier= TIMEOUT |identifier= OTHERWISE |ValExpr= value_expression ) )
            // AadlBa.g:746:4: (identifier= TIMEOUT |identifier= OTHERWISE |ValExpr= value_expression )
            {
            // AadlBa.g:746:4: (identifier= TIMEOUT |identifier= OTHERWISE |ValExpr= value_expression )
            int alt23=3;
            switch ( input.LA(1) ) {
            case TIMEOUT:
                {
                alt23=1;
                }
                break;
            case OTHERWISE:
                {
                alt23=2;
                }
                break;
            case ABS:
            case FALSE:
            case IDENT:
            case INTEGER_LIT:
            case LPAREN:
            case MINUS:
            case NOT:
            case PLUS:
            case REAL_LIT:
            case STRING_LITERAL:
            case TRUE:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ExecCond;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // AadlBa.g:747:8: identifier= TIMEOUT
                    {
                    identifier=(Token)match(input,TIMEOUT,FOLLOW_TIMEOUT_in_execute_condition2272); if (state.failed) return ExecCond;

                    if ( state.backtracking==0 ) {
                             ExecCond = _fact.createExecutionTimeoutCatch();
                             setLocationReference(ExecCond, identifier);
                           }

                    }
                    break;
                case 2 :
                    // AadlBa.g:753:8: identifier= OTHERWISE
                    {
                    identifier=(Token)match(input,OTHERWISE,FOLLOW_OTHERWISE_in_execute_condition2299); if (state.failed) return ExecCond;

                    if ( state.backtracking==0 ) {
                             ExecCond = _fact.createOtherwise() ;
                             setLocationReference(ExecCond, identifier);
                           }

                    }
                    break;
                case 3 :
                    // AadlBa.g:759:8: ValExpr= value_expression
                    {
                    pushFollow(FOLLOW_value_expression_in_execute_condition2333);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return ExecCond;

                    if ( state.backtracking==0 ) { 
                             ExecCond = ValExpr ;
                           }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ExecCond;
    }
    // $ANTLR end "execute_condition"



    // $ANTLR start "integer_value_constant"
    // AadlBa.g:771:1: integer_value_constant returns [IntegerValueConstant ivc] : (il= integer_literal |prop= property );
    public final IntegerValueConstant integer_value_constant() throws RecognitionException {
        IntegerValueConstant ivc = null;


        BehaviorIntegerLiteral il =null;

        QualifiedNamedElement prop =null;


        try {
            // AadlBa.g:773:2: (il= integer_literal |prop= property )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==INTEGER_LIT) ) {
                alt24=1;
            }
            else if ( (LA24_0==IDENT) ) {
                alt24=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ivc;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // AadlBa.g:774:6: il= integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_integer_value_constant2377);
                    il=integer_literal();

                    state._fsp--;
                    if (state.failed) return ivc;

                    if ( state.backtracking==0 ) {ivc = il ;}

                    }
                    break;
                case 2 :
                    // AadlBa.g:777:6: prop= property
                    {
                    pushFollow(FOLLOW_property_in_integer_value_constant2399);
                    prop=property();

                    state._fsp--;
                    if (state.failed) return ivc;

                    if ( state.backtracking==0 ) {ivc = prop;}

                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ivc;
    }
    // $ANTLR end "integer_value_constant"



    // $ANTLR start "dispatch_condition"
    // AadlBa.g:803:1: dispatch_condition returns [DispatchCondition DisCond] : DISPATCH (DisTriggCond= dispatch_trigger_condition )? ( FROZEN port= reference ( COMMA port= reference )* )? ;
    public final DispatchCondition dispatch_condition() throws RecognitionException {
        DispatchCondition DisCond = null;


        DispatchTriggerCondition DisTriggCond =null;

        Reference port =null;



           DisCond = _fact.createDispatchCondition (); // Location reference is set in behavior_transition
         
        try {
            // AadlBa.g:807:3: ( DISPATCH (DisTriggCond= dispatch_trigger_condition )? ( FROZEN port= reference ( COMMA port= reference )* )? )
            // AadlBa.g:808:4: DISPATCH (DisTriggCond= dispatch_trigger_condition )? ( FROZEN port= reference ( COMMA port= reference )* )?
            {
            match(input,DISPATCH,FOLLOW_DISPATCH_in_dispatch_condition2450); if (state.failed) return DisCond;

            // AadlBa.g:809:4: (DisTriggCond= dispatch_trigger_condition )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==IDENT||LA25_0==STOP||LA25_0==TIMEOUT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // AadlBa.g:809:6: DisTriggCond= dispatch_trigger_condition
                    {
                    pushFollow(FOLLOW_dispatch_trigger_condition_in_dispatch_condition2460);
                    DisTriggCond=dispatch_trigger_condition();

                    state._fsp--;
                    if (state.failed) return DisCond;

                    if ( state.backtracking==0 ) {
                           DisCond.setDispatchTriggerCondition (DisTriggCond);
                         }

                    }
                    break;

            }


            // AadlBa.g:815:4: ( FROZEN port= reference ( COMMA port= reference )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==FROZEN) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // AadlBa.g:815:6: FROZEN port= reference ( COMMA port= reference )*
                    {
                    match(input,FROZEN,FOLLOW_FROZEN_in_dispatch_condition2484); if (state.failed) return DisCond;

                    pushFollow(FOLLOW_reference_in_dispatch_condition2488);
                    port=reference();

                    state._fsp--;
                    if (state.failed) return DisCond;

                    if ( state.backtracking==0 ) {
                           DisCond.getFrozenPorts().add(port);
                         }

                    // AadlBa.g:819:6: ( COMMA port= reference )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==COMMA) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // AadlBa.g:819:8: COMMA port= reference
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_dispatch_condition2504); if (state.failed) return DisCond;

                    	    pushFollow(FOLLOW_reference_in_dispatch_condition2508);
                    	    port=reference();

                    	    state._fsp--;
                    	    if (state.failed) return DisCond;

                    	    if ( state.backtracking==0 ) {
                    	             DisCond.getFrozenPorts().add(port);
                    	           }

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DisCond;
    }
    // $ANTLR end "dispatch_condition"



    // $ANTLR start "dispatch_trigger_condition"
    // AadlBa.g:844:1: dispatch_trigger_condition returns [DispatchTriggerCondition DisTriggCond] : (identifier= STOP | (identifier= TIMEOUT (BehTime= behavior_time )? ) |DisTriggLogicalExpr= dispatch_trigger_logical_expression );
    public final DispatchTriggerCondition dispatch_trigger_condition() throws RecognitionException {
        DispatchTriggerCondition DisTriggCond = null;


        Token identifier=null;
        DeclarativeTime BehTime =null;

        DispatchTriggerLogicalExpression DisTriggLogicalExpr =null;



           DisTriggCond = null ;
         
        try {
            // AadlBa.g:848:4: (identifier= STOP | (identifier= TIMEOUT (BehTime= behavior_time )? ) |DisTriggLogicalExpr= dispatch_trigger_logical_expression )
            int alt29=3;
            switch ( input.LA(1) ) {
            case STOP:
                {
                alt29=1;
                }
                break;
            case TIMEOUT:
                {
                alt29=2;
                }
                break;
            case IDENT:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return DisTriggCond;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // AadlBa.g:854:8: identifier= STOP
                    {
                    identifier=(Token)match(input,STOP,FOLLOW_STOP_in_dispatch_trigger_condition2610); if (state.failed) return DisTriggCond;

                    if ( state.backtracking==0 ) { DisTriggCond = _fact.createDispatchTriggerConditionStop() ;
                             setLocationReference(DisTriggCond, identifier) ;
                           }

                    }
                    break;
                case 2 :
                    // AadlBa.g:859:8: (identifier= TIMEOUT (BehTime= behavior_time )? )
                    {
                    // AadlBa.g:859:8: (identifier= TIMEOUT (BehTime= behavior_time )? )
                    // AadlBa.g:859:10: identifier= TIMEOUT (BehTime= behavior_time )?
                    {
                    identifier=(Token)match(input,TIMEOUT,FOLLOW_TIMEOUT_in_dispatch_trigger_condition2639); if (state.failed) return DisTriggCond;

                    if ( state.backtracking==0 ) { DisTriggCond = _fact.createDispatchRelativeTimeout() ;
                               setLocationReference(DisTriggCond, identifier) ;
                             }

                    // AadlBa.g:863:10: (BehTime= behavior_time )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==FALSE||LA28_0==IDENT||LA28_0==INTEGER_LIT||LA28_0==REAL_LIT||LA28_0==STRING_LITERAL||LA28_0==TRUE) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // AadlBa.g:864:12: BehTime= behavior_time
                            {
                            pushFollow(FOLLOW_behavior_time_in_dispatch_trigger_condition2681);
                            BehTime=behavior_time();

                            state._fsp--;
                            if (state.failed) return DisTriggCond;

                            if ( state.backtracking==0 ) { 
                                         DisTriggCond = BehTime ;
                                       }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:871:8: DisTriggLogicalExpr= dispatch_trigger_logical_expression
                    {
                    pushFollow(FOLLOW_dispatch_trigger_logical_expression_in_dispatch_trigger_condition2734);
                    DisTriggLogicalExpr=dispatch_trigger_logical_expression();

                    state._fsp--;
                    if (state.failed) return DisTriggCond;

                    if ( state.backtracking==0 ) {
                             DisTriggCond = DisTriggLogicalExpr ;
                           }

                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DisTriggCond;
    }
    // $ANTLR end "dispatch_trigger_condition"



    // $ANTLR start "dispatch_trigger_logical_expression"
    // AadlBa.g:884:1: dispatch_trigger_logical_expression returns [DispatchTriggerLogicalExpression\n DisTriggLogicalExpr] : DisConjunct= dispatch_conjunction ( OR DisConjunct= dispatch_conjunction )* ;
    public final DispatchTriggerLogicalExpression dispatch_trigger_logical_expression() throws RecognitionException {
        DispatchTriggerLogicalExpression DisTriggLogicalExpr = null;


        DispatchConjunction DisConjunct =null;



           DisTriggLogicalExpr = _fact.createDispatchTriggerLogicalExpression ();
         
        try {
            // AadlBa.g:889:4: (DisConjunct= dispatch_conjunction ( OR DisConjunct= dispatch_conjunction )* )
            // AadlBa.g:890:6: DisConjunct= dispatch_conjunction ( OR DisConjunct= dispatch_conjunction )*
            {
            pushFollow(FOLLOW_dispatch_conjunction_in_dispatch_trigger_logical_expression2780);
            DisConjunct=dispatch_conjunction();

            state._fsp--;
            if (state.failed) return DisTriggLogicalExpr;

            if ( state.backtracking==0 ) {
                   DisTriggLogicalExpr.getDispatchConjunctions().add(DisConjunct) ;
                   DisTriggLogicalExpr.setLocationReference(
                     DisConjunct.getLocationReference());
                 }

            // AadlBa.g:896:6: ( OR DisConjunct= dispatch_conjunction )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==OR) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // AadlBa.g:897:8: OR DisConjunct= dispatch_conjunction
            	    {
            	    match(input,OR,FOLLOW_OR_in_dispatch_trigger_logical_expression2803); if (state.failed) return DisTriggLogicalExpr;

            	    pushFollow(FOLLOW_dispatch_conjunction_in_dispatch_trigger_logical_expression2807);
            	    DisConjunct=dispatch_conjunction();

            	    state._fsp--;
            	    if (state.failed) return DisTriggLogicalExpr;

            	    if ( state.backtracking==0 ) {
            	             DisTriggLogicalExpr.getDispatchConjunctions().add(DisConjunct) ;
            	           }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DisTriggLogicalExpr;
    }
    // $ANTLR end "dispatch_trigger_logical_expression"



    // $ANTLR start "dispatch_conjunction"
    // AadlBa.g:915:1: dispatch_conjunction returns [DispatchConjunction DisConjunct] : ref= reference ( AND ref= reference )* ;
    public final DispatchConjunction dispatch_conjunction() throws RecognitionException {
        DispatchConjunction DisConjunct = null;


        Reference ref =null;



           DisConjunct = _fact.createDispatchConjunction ();
         
        try {
            // AadlBa.g:920:4: (ref= reference ( AND ref= reference )* )
            // AadlBa.g:921:6: ref= reference ( AND ref= reference )*
            {
            pushFollow(FOLLOW_reference_in_dispatch_conjunction2866);
            ref=reference();

            state._fsp--;
            if (state.failed) return DisConjunct;

            if ( state.backtracking==0 ) {
                   DisConjunct.getDispatchTriggers().add(ref) ;
                   DisConjunct.setLocationReference(ref.getLocationReference());
                 }

            // AadlBa.g:926:6: ( AND ref= reference )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==AND) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // AadlBa.g:927:8: AND ref= reference
            	    {
            	    match(input,AND,FOLLOW_AND_in_dispatch_conjunction2889); if (state.failed) return DisConjunct;

            	    pushFollow(FOLLOW_reference_in_dispatch_conjunction2893);
            	    ref=reference();

            	    state._fsp--;
            	    if (state.failed) return DisConjunct;

            	    if ( state.backtracking==0 ) {
            	             DisConjunct.getDispatchTriggers().add(ref) ;
            	           }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return DisConjunct;
    }
    // $ANTLR end "dispatch_conjunction"



    // $ANTLR start "behavior_actions"
    // AadlBa.g:959:1: behavior_actions returns [BehaviorActions BehActs] : BehAction= behavior_action ( ( SEMICOLON BehAction2= behavior_action )* | ( CONCAT BehAction2= behavior_action )* ) ;
    public final BehaviorActions behavior_actions() throws RecognitionException {
        BehaviorActions BehActs = null;


        BehaviorAction BehAction =null;

        BehaviorAction BehAction2 =null;



           BehActs = null ;
           EList<BehaviorAction> tmpList = new BasicEList<BehaviorAction>() ;
           BehaviorActionCollection col = null ;
         
        try {
            // AadlBa.g:965:3: (BehAction= behavior_action ( ( SEMICOLON BehAction2= behavior_action )* | ( CONCAT BehAction2= behavior_action )* ) )
            // AadlBa.g:966:4: BehAction= behavior_action ( ( SEMICOLON BehAction2= behavior_action )* | ( CONCAT BehAction2= behavior_action )* )
            {
            pushFollow(FOLLOW_behavior_action_in_behavior_actions2961);
            BehAction=behavior_action();

            state._fsp--;
            if (state.failed) return BehActs;

            if ( state.backtracking==0 ) {
                 BehActs = BehAction ;
               }

            // AadlBa.g:971:4: ( ( SEMICOLON BehAction2= behavior_action )* | ( CONCAT BehAction2= behavior_action )* )
            int alt34=2;
            switch ( input.LA(1) ) {
            case SEMICOLON:
                {
                alt34=1;
                }
                break;
            case RCURLY:
                {
                int LA34_2 = input.LA(2);

                if ( (synpred35_AadlBa()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;

                }
                }
                break;
            case ELSIF:
                {
                int LA34_3 = input.LA(2);

                if ( (synpred35_AadlBa()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 3, input);

                    throw nvae;

                }
                }
                break;
            case ELSE:
                {
                int LA34_4 = input.LA(2);

                if ( (synpred35_AadlBa()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 4, input);

                    throw nvae;

                }
                }
                break;
            case END:
                {
                int LA34_5 = input.LA(2);

                if ( (synpred35_AadlBa()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 5, input);

                    throw nvae;

                }
                }
                break;
            case UNTIL:
                {
                int LA34_6 = input.LA(2);

                if ( (synpred35_AadlBa()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 6, input);

                    throw nvae;

                }
                }
                break;
            case EOF:
                {
                int LA34_7 = input.LA(2);

                if ( (synpred35_AadlBa()) ) {
                    alt34=1;
                }
                else if ( (true) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BehActs;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 7, input);

                    throw nvae;

                }
                }
                break;
            case CONCAT:
                {
                alt34=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return BehActs;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // AadlBa.g:972:9: ( SEMICOLON BehAction2= behavior_action )*
                    {
                    // AadlBa.g:972:9: ( SEMICOLON BehAction2= behavior_action )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==SEMICOLON) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // AadlBa.g:972:11: SEMICOLON BehAction2= behavior_action
                    	    {
                    	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_behavior_actions2987); if (state.failed) return BehActs;

                    	    pushFollow(FOLLOW_behavior_action_in_behavior_actions2991);
                    	    BehAction2=behavior_action();

                    	    state._fsp--;
                    	    if (state.failed) return BehActs;

                    	    if ( state.backtracking==0 ) {
                    	                  tmpList.add(BehAction2) ;
                    	                }

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) { col = _fact.createBehaviorActionSequence() ; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:979:9: ( CONCAT BehAction2= behavior_action )*
                    {
                    // AadlBa.g:979:9: ( CONCAT BehAction2= behavior_action )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==CONCAT) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // AadlBa.g:979:11: CONCAT BehAction2= behavior_action
                    	    {
                    	    match(input,CONCAT,FOLLOW_CONCAT_in_behavior_actions3047); if (state.failed) return BehActs;

                    	    pushFollow(FOLLOW_behavior_action_in_behavior_actions3051);
                    	    BehAction2=behavior_action();

                    	    state._fsp--;
                    	    if (state.failed) return BehActs;

                    	    if ( state.backtracking==0 ) {
                    	                  tmpList.add(BehAction2) ;
                    	                }

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) { col = _fact.createBehaviorActionSet() ; }

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                  if (tmpList.size() != 0)
                  { 
                    col.getActions().add(BehAction);
                    col.getActions().addAll(tmpList);
                    col.setLocationReference(BehActs.getLocationReference());
                    BehActs = col ;
                  }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehActs;
    }
    // $ANTLR end "behavior_actions"



    // $ANTLR start "behavior_action"
    // AadlBa.g:1017:1: behavior_action returns [BehaviorAction BehAction] : ( (BaAct= basic_action ) | (BehActionBlock= behavior_action_block ) | (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? END IF ) | (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN ) ) ;
    public final BehaviorAction behavior_action() throws RecognitionException {
        BehaviorAction BehAction = null;


        Token identifier1=null;
        Token identifier2=null;
        Token identifier=null;
        BasicAction BaAct =null;

        BehaviorActionBlock BehActionBlock =null;

        ValueExpression ValExpr =null;

        BehaviorActions BehActions =null;

        QualifiedNamedElement dt =null;

        ElementValues EltVal =null;



           BehAction = null;
           IfStatement IfStat = null ;
           IfStatement tmpIfStat = null ;
           ForOrForAllStatement ForStat = null ;
           IterativeVariable itVar = null ;
         
        try {
            // AadlBa.g:1025:3: ( ( (BaAct= basic_action ) | (BehActionBlock= behavior_action_block ) | (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? END IF ) | (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN ) ) )
            // AadlBa.g:1026:4: ( (BaAct= basic_action ) | (BehActionBlock= behavior_action_block ) | (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? END IF ) | (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN ) )
            {
            // AadlBa.g:1026:4: ( (BaAct= basic_action ) | (BehActionBlock= behavior_action_block ) | (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? END IF ) | (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY ) | (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN ) )
            int alt37=7;
            switch ( input.LA(1) ) {
            case COMPUTATION:
            case IDENT:
            case STAR:
                {
                alt37=1;
                }
                break;
            case LCURLY:
                {
                alt37=2;
                }
                break;
            case IF:
                {
                alt37=3;
                }
                break;
            case FOR:
                {
                alt37=4;
                }
                break;
            case FORALL:
                {
                alt37=5;
                }
                break;
            case WHILE:
                {
                alt37=6;
                }
                break;
            case DO:
                {
                alt37=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return BehAction;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;

            }

            switch (alt37) {
                case 1 :
                    // AadlBa.g:1027:6: (BaAct= basic_action )
                    {
                    // AadlBa.g:1027:6: (BaAct= basic_action )
                    // AadlBa.g:1027:8: BaAct= basic_action
                    {
                    pushFollow(FOLLOW_basic_action_in_behavior_action3154);
                    BaAct=basic_action();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { BehAction = BaAct ;}

                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1031:6: (BehActionBlock= behavior_action_block )
                    {
                    // AadlBa.g:1031:6: (BehActionBlock= behavior_action_block )
                    // AadlBa.g:1031:8: BehActionBlock= behavior_action_block
                    {
                    pushFollow(FOLLOW_behavior_action_block_in_behavior_action3187);
                    BehActionBlock=behavior_action_block();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { 
                              BehAction = BehActionBlock ;
                           }

                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:1038:6: (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? END IF )
                    {
                    // AadlBa.g:1038:6: (identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? END IF )
                    // AadlBa.g:1038:8: identifier1= IF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )* (identifier= ELSE BehActions= behavior_actions )? END IF
                    {
                    identifier1=(Token)match(input,IF,FOLLOW_IF_in_behavior_action3225); if (state.failed) return BehAction;

                    identifier2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3229); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_value_expression_in_behavior_action3233);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3235); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3239);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { 
                             IfStat = _fact.createIfStatement();
                             setLocationReference(IfStat, identifier1); 
                             setLocationReference(ValExpr, identifier2); 
                             IfStat.setLogicalValueExpression(ValExpr) ;
                             IfStat.setBehaviorActions(BehActions);
                             tmpIfStat = IfStat ;
                           }

                    // AadlBa.g:1047:8: (identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==ELSIF) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // AadlBa.g:1048:10: identifier1= ELSIF identifier2= LPAREN ValExpr= value_expression RPAREN BehActions= behavior_actions
                    	    {
                    	    identifier1=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_behavior_action3272); if (state.failed) return BehAction;

                    	    identifier2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3276); if (state.failed) return BehAction;

                    	    pushFollow(FOLLOW_value_expression_in_behavior_action3280);
                    	    ValExpr=value_expression();

                    	    state._fsp--;
                    	    if (state.failed) return BehAction;

                    	    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3282); if (state.failed) return BehAction;

                    	    pushFollow(FOLLOW_behavior_actions_in_behavior_action3286);
                    	    BehActions=behavior_actions();

                    	    state._fsp--;
                    	    if (state.failed) return BehAction;

                    	    if ( state.backtracking==0 ) {
                    	               IfStatement ElifStat = _fact.createIfStatement() ;
                    	               ElifStat.setElif(true);
                    	               
                    	               setLocationReference(ElifStat, identifier1);
                    	               setLocationReference(ValExpr, identifier2) ; 
                    	               ElifStat.setLogicalValueExpression(ValExpr) ;
                    	               ElifStat.setBehaviorActions(BehActions);
                    	               
                    	               tmpIfStat.setElseStatement(ElifStat) ;
                    	               tmpIfStat = ElifStat ;
                    	             }

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    // AadlBa.g:1062:8: (identifier= ELSE BehActions= behavior_actions )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==ELSE) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // AadlBa.g:1063:10: identifier= ELSE BehActions= behavior_actions
                            {
                            identifier=(Token)match(input,ELSE,FOLLOW_ELSE_in_behavior_action3329); if (state.failed) return BehAction;

                            pushFollow(FOLLOW_behavior_actions_in_behavior_action3333);
                            BehActions=behavior_actions();

                            state._fsp--;
                            if (state.failed) return BehAction;

                            if ( state.backtracking==0 ) {
                                       ElseStatement elseStat = _fact.createElseStatement();
                                       setLocationReference(elseStat, identifier);
                                       elseStat.setBehaviorActions(BehActions);
                                       tmpIfStat.setElseStatement(elseStat);
                                     }

                            }
                            break;

                    }


                    match(input,END,FOLLOW_END_in_behavior_action3363); if (state.failed) return BehAction;

                    match(input,IF,FOLLOW_IF_in_behavior_action3365); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { 
                             BehAction = IfStat ;
                           }

                    }


                    }
                    break;
                case 4 :
                    // AadlBa.g:1078:6: (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY )
                    {
                    // AadlBa.g:1078:6: (identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY )
                    // AadlBa.g:1078:8: identifier= FOR LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY
                    {
                    identifier=(Token)match(input,FOR,FOLLOW_FOR_in_behavior_action3403); if (state.failed) return BehAction;

                    match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3405); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat = _fact.createForOrForAllStatement(); 
                                                   setLocationReference(ForStat, identifier); 
                                                 }

                    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_action3419); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {  
                                              itVar = _fact.createIterativeVariable(); 
                                              itVar.setName(identifier.getText());
                                              setLocationReference(itVar, identifier); 
                                              ForStat.setIterativeVariable(itVar); 
                                            }

                    match(input,COLON,FOLLOW_COLON_in_behavior_action3430); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_unique_component_classifier_reference_in_behavior_action3434);
                    dt=unique_component_classifier_reference();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {
                             itVar.setDataClassifier(dt);
                           }

                    match(input,IN,FOLLOW_IN_in_behavior_action3460); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_element_values_in_behavior_action3464);
                    EltVal=element_values();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3466); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat.setIteratedValues(EltVal); }

                    identifier=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_behavior_action3479); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3483);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RCURLY,FOLLOW_RCURLY_in_behavior_action3485); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat.setBehaviorActions(BehActions);
                             BehAction = ForStat ;
                           }

                    }


                    }
                    break;
                case 5 :
                    // AadlBa.g:1100:6: (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY )
                    {
                    // AadlBa.g:1100:6: (identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY )
                    // AadlBa.g:1100:8: identifier= FORALL LPAREN identifier= IDENT COLON dt= unique_component_classifier_reference IN EltVal= element_values RPAREN identifier= LCURLY BehActions= behavior_actions RCURLY
                    {
                    identifier=(Token)match(input,FORALL,FOLLOW_FORALL_in_behavior_action3524); if (state.failed) return BehAction;

                    match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3526); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { 
                            ForStat = _fact.createForOrForAllStatement();
                            ForStat.setForAll(true);
                            setLocationReference(ForStat, identifier); 
                           }

                    identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_action3547); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {  
                                              itVar = _fact.createIterativeVariable(); 
                                              itVar.setName(identifier.getText());
                                              setLocationReference(itVar, identifier); 
                                              ForStat.setIterativeVariable(itVar);
                                            }

                    match(input,COLON,FOLLOW_COLON_in_behavior_action3558); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_unique_component_classifier_reference_in_behavior_action3562);
                    dt=unique_component_classifier_reference();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {
                             itVar.setDataClassifier(dt);
                           }

                    match(input,IN,FOLLOW_IN_in_behavior_action3589); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_element_values_in_behavior_action3593);
                    EltVal=element_values();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3595); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat.setIteratedValues(EltVal); }

                    identifier=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_behavior_action3608); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3612);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RCURLY,FOLLOW_RCURLY_in_behavior_action3614); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) { ForStat.setBehaviorActions(BehActions) ;
                             BehAction = ForStat ;
                           }

                    }


                    }
                    break;
                case 6 :
                    // AadlBa.g:1125:6: (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY )
                    {
                    // AadlBa.g:1125:6: (identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY )
                    // AadlBa.g:1125:8: identifier1= WHILE identifier2= LPAREN ValExpr= value_expression RPAREN LCURLY BehActions= behavior_actions RCURLY
                    {
                    identifier1=(Token)match(input,WHILE,FOLLOW_WHILE_in_behavior_action3652); if (state.failed) return BehAction;

                    identifier2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3656); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_value_expression_in_behavior_action3660);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3662); if (state.failed) return BehAction;

                    match(input,LCURLY,FOLLOW_LCURLY_in_behavior_action3672); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3676);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RCURLY,FOLLOW_RCURLY_in_behavior_action3678); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {
                             WhileOrDoUntilStatement WhileStat = _fact.createWhileOrDoUntilStatement();
                             setLocationReference(WhileStat, identifier1); 
                             setLocationReference(ValExpr, identifier2) ;
                             WhileStat.setDoUntil(false);
                             WhileStat.setLogicalValueExpression(ValExpr);
                             WhileStat.setBehaviorActions(BehActions);
                             BehAction = WhileStat ; 
                           }

                    }


                    }
                    break;
                case 7 :
                    // AadlBa.g:1139:6: (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN )
                    {
                    // AadlBa.g:1139:6: (identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN )
                    // AadlBa.g:1139:8: identifier1= DO BehActions= behavior_actions UNTIL identifier2= LPAREN ValExpr= value_expression RPAREN
                    {
                    identifier1=(Token)match(input,DO,FOLLOW_DO_in_behavior_action3717); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_behavior_actions_in_behavior_action3721);
                    BehActions=behavior_actions();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,UNTIL,FOLLOW_UNTIL_in_behavior_action3723); if (state.failed) return BehAction;

                    identifier2=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_behavior_action3736); if (state.failed) return BehAction;

                    pushFollow(FOLLOW_value_expression_in_behavior_action3740);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return BehAction;

                    match(input,RPAREN,FOLLOW_RPAREN_in_behavior_action3742); if (state.failed) return BehAction;

                    if ( state.backtracking==0 ) {
                             WhileOrDoUntilStatement doUntilStat = _fact.createWhileOrDoUntilStatement();
                             setLocationReference(doUntilStat, identifier1); 
                             setLocationReference(ValExpr, identifier2) ;
                             doUntilStat.setDoUntil(true);
                             doUntilStat.setLogicalValueExpression(ValExpr);
                             doUntilStat.setBehaviorActions(BehActions);
                             BehAction = doUntilStat ;
                           }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehAction;
    }
    // $ANTLR end "behavior_action"



    // $ANTLR start "element_values"
    // AadlBa.g:1163:1: element_values returns [ElementValues EltVal] : ( (IntRange= integer_range ) | (AdcRef= reference ) );
    public final ElementValues element_values() throws RecognitionException {
        ElementValues EltVal = null;


        IntegerRange IntRange =null;

        Reference AdcRef =null;



         
        try {
            // AadlBa.g:1166:3: ( (IntRange= integer_range ) | (AdcRef= reference ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==IDENT) ) {
                int LA38_1 = input.LA(2);

                if ( (synpred45_AadlBa()) ) {
                    alt38=1;
                }
                else if ( (true) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return EltVal;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA38_0==FALSE||LA38_0==INTEGER_LIT||LA38_0==REAL_LIT||LA38_0==STRING_LITERAL||LA38_0==TRUE) ) {
                alt38=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return EltVal;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // AadlBa.g:1168:6: (IntRange= integer_range )
                    {
                    // AadlBa.g:1168:6: (IntRange= integer_range )
                    // AadlBa.g:1168:8: IntRange= integer_range
                    {
                    pushFollow(FOLLOW_integer_range_in_element_values3809);
                    IntRange=integer_range();

                    state._fsp--;
                    if (state.failed) return EltVal;

                    if ( state.backtracking==0 ) { EltVal = IntRange; }

                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1170:6: (AdcRef= reference )
                    {
                    // AadlBa.g:1170:6: (AdcRef= reference )
                    // AadlBa.g:1170:8: AdcRef= reference
                    {
                    pushFollow(FOLLOW_reference_in_element_values3829);
                    AdcRef=reference();

                    state._fsp--;
                    if (state.failed) return EltVal;

                    if ( state.backtracking==0 ) { EltVal = (ElementValues) AdcRef; }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return EltVal;
    }
    // $ANTLR end "element_values"



    // $ANTLR start "basic_action"
    // AadlBa.g:1183:1: basic_action returns [BasicAction BaAction] : ( (AssAct= assignment_action ) | (CommAct= communication_action ) | (TimedAct= timed_action ) );
    public final BasicAction basic_action() throws RecognitionException {
        BasicAction BaAction = null;


        AssignmentAction AssAct =null;

        CommAction CommAct =null;

        TimedAction TimedAct =null;




        try {
            // AadlBa.g:1186:3: ( (AssAct= assignment_action ) | (CommAct= communication_action ) | (TimedAct= timed_action ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA39_1 = input.LA(2);

                if ( (synpred46_AadlBa()) ) {
                    alt39=1;
                }
                else if ( (synpred47_AadlBa()) ) {
                    alt39=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return BaAction;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 39, 1, input);

                    throw nvae;

                }
                }
                break;
            case STAR:
                {
                alt39=2;
                }
                break;
            case COMPUTATION:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return BaAction;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;

            }

            switch (alt39) {
                case 1 :
                    // AadlBa.g:1187:6: (AssAct= assignment_action )
                    {
                    // AadlBa.g:1187:6: (AssAct= assignment_action )
                    // AadlBa.g:1187:8: AssAct= assignment_action
                    {
                    pushFollow(FOLLOW_assignment_action_in_basic_action3873);
                    AssAct=assignment_action();

                    state._fsp--;
                    if (state.failed) return BaAction;

                    if ( state.backtracking==0 ) { BaAction = AssAct; }

                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1189:6: (CommAct= communication_action )
                    {
                    // AadlBa.g:1189:6: (CommAct= communication_action )
                    // AadlBa.g:1189:8: CommAct= communication_action
                    {
                    pushFollow(FOLLOW_communication_action_in_basic_action3893);
                    CommAct=communication_action();

                    state._fsp--;
                    if (state.failed) return BaAction;

                    if ( state.backtracking==0 ) { BaAction = CommAct;}

                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:1191:6: (TimedAct= timed_action )
                    {
                    // AadlBa.g:1191:6: (TimedAct= timed_action )
                    // AadlBa.g:1191:8: TimedAct= timed_action
                    {
                    pushFollow(FOLLOW_timed_action_in_basic_action3913);
                    TimedAct=timed_action();

                    state._fsp--;
                    if (state.failed) return BaAction;

                    if ( state.backtracking==0 ) { BaAction = TimedAct; }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BaAction;
    }
    // $ANTLR end "basic_action"



    // $ANTLR start "assignment_action"
    // AadlBa.g:1203:1: assignment_action returns [AssignmentAction AssAct] : Tar= target ASSIGN (ValExpr= value_expression |identifier= ANY ) ;
    public final AssignmentAction assignment_action() throws RecognitionException {
        AssignmentAction AssAct = null;


        Token identifier=null;
        Target Tar =null;

        ValueExpression ValExpr =null;



           AssAct = _fact.createAssignmentAction();
         
        try {
            // AadlBa.g:1207:3: (Tar= target ASSIGN (ValExpr= value_expression |identifier= ANY ) )
            // AadlBa.g:1208:4: Tar= target ASSIGN (ValExpr= value_expression |identifier= ANY )
            {
            pushFollow(FOLLOW_target_in_assignment_action3957);
            Tar=target();

            state._fsp--;
            if (state.failed) return AssAct;

            match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_action3959); if (state.failed) return AssAct;

            // AadlBa.g:1208:22: (ValExpr= value_expression |identifier= ANY )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==ABS||LA40_0==FALSE||LA40_0==IDENT||LA40_0==INTEGER_LIT||LA40_0==LPAREN||LA40_0==MINUS||LA40_0==NOT||LA40_0==PLUS||LA40_0==REAL_LIT||LA40_0==STRING_LITERAL||LA40_0==TRUE) ) {
                alt40=1;
            }
            else if ( (LA40_0==ANY) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return AssAct;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }
            switch (alt40) {
                case 1 :
                    // AadlBa.g:1208:24: ValExpr= value_expression
                    {
                    pushFollow(FOLLOW_value_expression_in_assignment_action3965);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return AssAct;

                    }
                    break;
                case 2 :
                    // AadlBa.g:1208:51: identifier= ANY
                    {
                    identifier=(Token)match(input,ANY,FOLLOW_ANY_in_assignment_action3971); if (state.failed) return AssAct;

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                 AssAct.setLocationReference(Tar.getLocationReference());
                 AssAct.setTarget(Tar);
                   
                 if (ValExpr != null)
                 {
                   AssAct.setValueExpression(ValExpr);
                 }
                 else
                 {
                   Any any = _fact.createAny() ;
                   setLocationReference(any, identifier);
                   AssAct.setValueExpression(any);
                 }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return AssAct;
    }
    // $ANTLR end "assignment_action"



    // $ANTLR start "target"
    // AadlBa.g:1237:1: target returns [Target Tar] : dt= reference ;
    public final Target target() throws RecognitionException {
        Target Tar = null;


        Reference dt =null;



           Tar = null ;
         
        try {
            // AadlBa.g:1241:3: (dt= reference )
            // AadlBa.g:1244:5: dt= reference
            {
            pushFollow(FOLLOW_reference_in_target4027);
            dt=reference();

            state._fsp--;
            if (state.failed) return Tar;

            if ( state.backtracking==0 ) {Tar= (Target) dt ;}

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Tar;
    }
    // $ANTLR end "target"



    // $ANTLR start "qualified_named_element"
    // AadlBa.g:1253:1: qualified_named_element returns [QualifiedNamedElement qne] : ( (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )? ) ;
    public final QualifiedNamedElement qualified_named_element() throws RecognitionException {
        QualifiedNamedElement qne = null;


        Token identifier1=null;
        Token identifier2=null;
        Token identifier3=null;


          String id1 = "";
          String id2 = "";

        try {
            // AadlBa.g:1259:3: ( ( (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )? ) )
            // AadlBa.g:1260:4: ( (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )? )
            {
            // AadlBa.g:1260:4: ( (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )? )
            // AadlBa.g:1261:5: (identifier1= IDENT DOUBLECOLON )+ identifier2= IDENT ( DOT identifier3= IDENT )?
            {
            // AadlBa.g:1261:5: (identifier1= IDENT DOUBLECOLON )+
            int cnt41=0;
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==IDENT) ) {
                    int LA41_1 = input.LA(2);

                    if ( (LA41_1==DOUBLECOLON) ) {
                        alt41=1;
                    }


                }


                switch (alt41) {
            	case 1 :
            	    // AadlBa.g:1261:7: identifier1= IDENT DOUBLECOLON
            	    {
            	    identifier1=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualified_named_element4111); if (state.failed) return qne;

            	    match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_qualified_named_element4113); if (state.failed) return qne;

            	    if ( state.backtracking==0 ) { 
            	            id1=id1+(id1.length() == 0 ? "":"::")+identifier1.getText();
            	          }

            	    }
            	    break;

            	default :
            	    if ( cnt41 >= 1 ) break loop41;
            	    if (state.backtracking>0) {state.failed=true; return qne;}
                        EarlyExitException eee =
                            new EarlyExitException(41, input);
                        throw eee;
                }
                cnt41++;
            } while (true);


            identifier2=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualified_named_element4141); if (state.failed) return qne;

            if ( state.backtracking==0 ) { 
                  id2=identifier2.getText();
                }

            // AadlBa.g:1271:5: ( DOT identifier3= IDENT )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==DOT) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // AadlBa.g:1271:7: DOT identifier3= IDENT
                    {
                    match(input,DOT,FOLLOW_DOT_in_qualified_named_element4155); if (state.failed) return qne;

                    identifier3=(Token)match(input,IDENT,FOLLOW_IDENT_in_qualified_named_element4159); if (state.failed) return qne;

                    if ( state.backtracking==0 ) {
                            id2=id2+"."+identifier3.getText();
                          }

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
                 qne = _decl.createQualifiedNamedElement();
                 Identifier nameId = _decl.createIdentifier();
                 nameId.setId(id2);
                 setLocationReference(nameId, identifier2); 
                 qne.setBaName(nameId);
                
                 if (! id1.equals(""))
                 {
                   Identifier nameSpaceId = _decl.createIdentifier();
                   nameSpaceId.setId(id1);
                   setLocationReference(nameSpaceId, identifier1); 
                   qne.setBaNamespace(nameSpaceId);
                   setLocationReference(qne, identifier1);
                 }
               }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return qne;
    }
    // $ANTLR end "qualified_named_element"



    // $ANTLR start "communication_action"
    // AadlBa.g:1312:1: communication_action returns [CommAction ca] : ( (qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) | (ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) ) ) | (identifier= STAR ( EXCLLESS | EXCLGREATER ) ) );
    public final CommAction communication_action() throws RecognitionException {
        CommAction ca = null;


        Token identifier=null;
        QualifiedNamedElement qne =null;

        EList<ParameterLabel> SubpgmParamList =null;

        Reference ref =null;

        Target Tar =null;



          ca = _decl.createCommAction() ;

        try {
            // AadlBa.g:1317:3: ( (qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) | (ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) ) ) | (identifier= STAR ( EXCLLESS | EXCLGREATER ) ) )
            int alt48=3;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==IDENT) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==DOUBLECOLON) ) {
                    alt48=1;
                }
                else if ( (LA48_1==DOT||(LA48_1 >= EXCLAM && LA48_1 <= EXCLLESS)||LA48_1==GGREATER||LA48_1==INTERROG||LA48_1==LBRACK) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ca;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA48_0==STAR) ) {
                alt48=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ca;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;

            }
            switch (alt48) {
                case 1 :
                    // AadlBa.g:1331:7: (qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? )
                    {
                    // AadlBa.g:1331:7: (qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? )
                    // AadlBa.g:1332:9: qne= qualified_named_element EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )?
                    {
                    pushFollow(FOLLOW_qualified_named_element_in_communication_action4311);
                    qne=qualified_named_element();

                    state._fsp--;
                    if (state.failed) return ca;

                    match(input,EXCLAM,FOLLOW_EXCLAM_in_communication_action4313); if (state.failed) return ca;

                    if ( state.backtracking==0 ) {
                              ca.setLocationReference(qne.getLocationReference());
                              ca.setQualifiedName(qne);
                            }

                    // AadlBa.g:1337:9: ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==LPAREN) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // AadlBa.g:1338:11: LPAREN SubpgmParamList= subprogram_parameter_list RPAREN
                            {
                            match(input,LPAREN,FOLLOW_LPAREN_in_communication_action4346); if (state.failed) return ca;

                            pushFollow(FOLLOW_subprogram_parameter_list_in_communication_action4350);
                            SubpgmParamList=subprogram_parameter_list();

                            state._fsp--;
                            if (state.failed) return ca;

                            match(input,RPAREN,FOLLOW_RPAREN_in_communication_action4352); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                        ca.getParameters().addAll(SubpgmParamList);
                                      }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1345:7: (ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) ) )
                    {
                    // AadlBa.g:1345:7: (ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) ) )
                    // AadlBa.g:1346:9: ref= reference ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) )
                    {
                    pushFollow(FOLLOW_reference_in_communication_action4412);
                    ref=reference();

                    state._fsp--;
                    if (state.failed) return ca;

                    if ( state.backtracking==0 ) {
                              ca.setReference(ref);
                              ca.setLocationReference(ref.getLocationReference()) ;
                            }

                    // AadlBa.g:1351:9: ( ( INTERROG ( LPAREN Tar= target RPAREN )? ) | ( GGREATER ) | ( EXCLLESS ) | ( EXCLGREATER ) | ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? ) )
                    int alt46=5;
                    switch ( input.LA(1) ) {
                    case INTERROG:
                        {
                        alt46=1;
                        }
                        break;
                    case GGREATER:
                        {
                        alt46=2;
                        }
                        break;
                    case EXCLLESS:
                        {
                        alt46=3;
                        }
                        break;
                    case EXCLGREATER:
                        {
                        alt46=4;
                        }
                        break;
                    case EXCLAM:
                        {
                        alt46=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ca;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;

                    }

                    switch (alt46) {
                        case 1 :
                            // AadlBa.g:1352:13: ( INTERROG ( LPAREN Tar= target RPAREN )? )
                            {
                            // AadlBa.g:1352:13: ( INTERROG ( LPAREN Tar= target RPAREN )? )
                            // AadlBa.g:1353:15: INTERROG ( LPAREN Tar= target RPAREN )?
                            {
                            match(input,INTERROG,FOLLOW_INTERROG_in_communication_action4462); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                            ca.setPortDequeue(true);
                                          }

                            // AadlBa.g:1357:15: ( LPAREN Tar= target RPAREN )?
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==LPAREN) ) {
                                alt44=1;
                            }
                            switch (alt44) {
                                case 1 :
                                    // AadlBa.g:1358:17: LPAREN Tar= target RPAREN
                                    {
                                    match(input,LPAREN,FOLLOW_LPAREN_in_communication_action4512); if (state.failed) return ca;

                                    pushFollow(FOLLOW_target_in_communication_action4516);
                                    Tar=target();

                                    state._fsp--;
                                    if (state.failed) return ca;

                                    match(input,RPAREN,FOLLOW_RPAREN_in_communication_action4518); if (state.failed) return ca;

                                    if ( state.backtracking==0 ) {
                                                      ca.setTarget(Tar);
                                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // AadlBa.g:1365:13: ( GGREATER )
                            {
                            // AadlBa.g:1365:13: ( GGREATER )
                            // AadlBa.g:1366:15: GGREATER
                            {
                            match(input,GGREATER,FOLLOW_GGREATER_in_communication_action4609); if (state.failed) return ca;

                            if ( state.backtracking==0 ) { 
                                            ca.setPortFreeze(true);
                                          }

                            }


                            }
                            break;
                        case 3 :
                            // AadlBa.g:1372:13: ( EXCLLESS )
                            {
                            // AadlBa.g:1372:13: ( EXCLLESS )
                            // AadlBa.g:1373:15: EXCLLESS
                            {
                            match(input,EXCLLESS,FOLLOW_EXCLLESS_in_communication_action4681); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                            ca.setLock(true);
                                          }

                            }


                            }
                            break;
                        case 4 :
                            // AadlBa.g:1379:13: ( EXCLGREATER )
                            {
                            // AadlBa.g:1379:13: ( EXCLGREATER )
                            // AadlBa.g:1380:15: EXCLGREATER
                            {
                            match(input,EXCLGREATER,FOLLOW_EXCLGREATER_in_communication_action4753); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                            ca.setUnlock(true);
                                          }

                            }


                            }
                            break;
                        case 5 :
                            // AadlBa.g:1386:13: ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? )
                            {
                            // AadlBa.g:1386:13: ( EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )? )
                            // AadlBa.g:1387:15: EXCLAM ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )?
                            {
                            match(input,EXCLAM,FOLLOW_EXCLAM_in_communication_action4825); if (state.failed) return ca;

                            // AadlBa.g:1388:15: ( LPAREN SubpgmParamList= subprogram_parameter_list RPAREN )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( (LA45_0==LPAREN) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // AadlBa.g:1389:17: LPAREN SubpgmParamList= subprogram_parameter_list RPAREN
                                    {
                                    match(input,LPAREN,FOLLOW_LPAREN_in_communication_action4860); if (state.failed) return ca;

                                    pushFollow(FOLLOW_subprogram_parameter_list_in_communication_action4864);
                                    SubpgmParamList=subprogram_parameter_list();

                                    state._fsp--;
                                    if (state.failed) return ca;

                                    match(input,RPAREN,FOLLOW_RPAREN_in_communication_action4866); if (state.failed) return ca;

                                    if ( state.backtracking==0 ) {
                                                      ca.getParameters().addAll(SubpgmParamList);
                                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:1398:7: (identifier= STAR ( EXCLLESS | EXCLGREATER ) )
                    {
                    // AadlBa.g:1398:7: (identifier= STAR ( EXCLLESS | EXCLGREATER ) )
                    // AadlBa.g:1399:9: identifier= STAR ( EXCLLESS | EXCLGREATER )
                    {
                    identifier=(Token)match(input,STAR,FOLLOW_STAR_in_communication_action4959); if (state.failed) return ca;

                    // AadlBa.g:1400:9: ( EXCLLESS | EXCLGREATER )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==EXCLLESS) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==EXCLGREATER) ) {
                        alt47=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ca;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;

                    }
                    switch (alt47) {
                        case 1 :
                            // AadlBa.g:1401:13: EXCLLESS
                            {
                            match(input,EXCLLESS,FOLLOW_EXCLLESS_in_communication_action4984); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                          ca.setLock(true);
                                        }

                            }
                            break;
                        case 2 :
                            // AadlBa.g:1406:13: EXCLGREATER
                            {
                            match(input,EXCLGREATER,FOLLOW_EXCLGREATER_in_communication_action5025); if (state.failed) return ca;

                            if ( state.backtracking==0 ) {
                                          ca.setUnlock(true);
                                        }

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                              setLocationReference(ca, identifier);
                            }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ca;
    }
    // $ANTLR end "communication_action"



    // $ANTLR start "timed_action"
    // AadlBa.g:1593:1: timed_action returns [TimedAction TimedAct] : (identifier= COMPUTATION ) LPAREN BehTime= behavior_time ( DOTDOT BehTime= behavior_time )? RPAREN ;
    public final TimedAction timed_action() throws RecognitionException {
        TimedAction TimedAct = null;


        Token identifier=null;
        DeclarativeTime BehTime =null;



           TimedAct = _fact.createTimedAction();
         
        try {
            // AadlBa.g:1597:3: ( (identifier= COMPUTATION ) LPAREN BehTime= behavior_time ( DOTDOT BehTime= behavior_time )? RPAREN )
            // AadlBa.g:1598:4: (identifier= COMPUTATION ) LPAREN BehTime= behavior_time ( DOTDOT BehTime= behavior_time )? RPAREN
            {
            // AadlBa.g:1598:4: (identifier= COMPUTATION )
            // AadlBa.g:1598:6: identifier= COMPUTATION
            {
            identifier=(Token)match(input,COMPUTATION,FOLLOW_COMPUTATION_in_timed_action5108); if (state.failed) return TimedAct;

            if ( state.backtracking==0 ) {setLocationReference(TimedAct, identifier) ; }

            }


            match(input,LPAREN,FOLLOW_LPAREN_in_timed_action5124); if (state.failed) return TimedAct;

            pushFollow(FOLLOW_behavior_time_in_timed_action5133);
            BehTime=behavior_time();

            state._fsp--;
            if (state.failed) return TimedAct;

            if ( state.backtracking==0 ) {TimedAct.setLowerTime(BehTime); }

            // AadlBa.g:1602:6: ( DOTDOT BehTime= behavior_time )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==DOTDOT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // AadlBa.g:1602:7: DOTDOT BehTime= behavior_time
                    {
                    match(input,DOTDOT,FOLLOW_DOTDOT_in_timed_action5143); if (state.failed) return TimedAct;

                    pushFollow(FOLLOW_behavior_time_in_timed_action5147);
                    BehTime=behavior_time();

                    state._fsp--;
                    if (state.failed) return TimedAct;

                    if ( state.backtracking==0 ) {TimedAct.setUpperTime(BehTime);}

                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_timed_action5163); if (state.failed) return TimedAct;

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return TimedAct;
    }
    // $ANTLR end "timed_action"



    // $ANTLR start "subprogram_parameter_list"
    // AadlBa.g:1615:1: subprogram_parameter_list returns [EList<ParameterLabel> SpgParamList] : ParamLabel= parameter_label (identifier= COMMA ParamLabel= parameter_label )* ;
    public final EList<ParameterLabel> subprogram_parameter_list() throws RecognitionException {
        EList<ParameterLabel> SpgParamList = null;


        Token identifier=null;
        ParameterLabel ParamLabel =null;



           SpgParamList = new BasicEList<ParameterLabel>();
         
        try {
            // AadlBa.g:1619:3: (ParamLabel= parameter_label (identifier= COMMA ParamLabel= parameter_label )* )
            // AadlBa.g:1620:4: ParamLabel= parameter_label (identifier= COMMA ParamLabel= parameter_label )*
            {
            pushFollow(FOLLOW_parameter_label_in_subprogram_parameter_list5198);
            ParamLabel=parameter_label();

            state._fsp--;
            if (state.failed) return SpgParamList;

            if ( state.backtracking==0 ) { SpgParamList.add(ParamLabel);}

            // AadlBa.g:1621:4: (identifier= COMMA ParamLabel= parameter_label )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMA) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // AadlBa.g:1621:5: identifier= COMMA ParamLabel= parameter_label
            	    {
            	    identifier=(Token)match(input,COMMA,FOLLOW_COMMA_in_subprogram_parameter_list5209); if (state.failed) return SpgParamList;

            	    pushFollow(FOLLOW_parameter_label_in_subprogram_parameter_list5213);
            	    ParamLabel=parameter_label();

            	    state._fsp--;
            	    if (state.failed) return SpgParamList;

            	    if ( state.backtracking==0 ) { SpgParamList.add(ParamLabel);
            	                                                      if( ParamLabel.getLocationReference() == null) // SG case of an ValueExpr else Target is already set
            	                                                      {
            	                                                         setLocationReference(ParamLabel, identifier) ; 
            	                                                      }
            	                                                    }

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return SpgParamList;
    }
    // $ANTLR end "subprogram_parameter_list"



    // $ANTLR start "parameter_label"
    // AadlBa.g:1637:1: parameter_label returns [ParameterLabel ParamLabel] : (ValExpr= value_expression ) ;
    public final ParameterLabel parameter_label() throws RecognitionException {
        ParameterLabel ParamLabel = null;


        ValueExpression ValExpr =null;



         
        try {
            // AadlBa.g:1640:3: ( (ValExpr= value_expression ) )
            // AadlBa.g:1644:4: (ValExpr= value_expression )
            {
            // AadlBa.g:1644:4: (ValExpr= value_expression )
            // AadlBa.g:1645:8: ValExpr= value_expression
            {
            pushFollow(FOLLOW_value_expression_in_parameter_label5278);
            ValExpr=value_expression();

            state._fsp--;
            if (state.failed) return ParamLabel;

            if ( state.backtracking==0 ) { ParamLabel = ValExpr; }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ParamLabel;
    }
    // $ANTLR end "parameter_label"



    // $ANTLR start "reference"
    // AadlBa.g:1657:1: reference returns [Reference ref] : id= array_identifier ( DOT id= array_identifier )* ;
    public final Reference reference() throws RecognitionException {
        Reference ref = null;


        ArrayableIdentifier id =null;



            ref = _decl.createReference() ;
           
         
        try {
            // AadlBa.g:1662:3: (id= array_identifier ( DOT id= array_identifier )* )
            // AadlBa.g:1663:5: id= array_identifier ( DOT id= array_identifier )*
            {
            pushFollow(FOLLOW_array_identifier_in_reference5323);
            id=array_identifier();

            state._fsp--;
            if (state.failed) return ref;

            if ( state.backtracking==0 ) {
                  ref.getIds().add(id);
                  ref.setLocationReference(id.getLocationReference());
                }

            // AadlBa.g:1668:5: ( DOT id= array_identifier )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==DOT) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // AadlBa.g:1669:7: DOT id= array_identifier
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_reference5343); if (state.failed) return ref;

            	    pushFollow(FOLLOW_array_identifier_in_reference5347);
            	    id=array_identifier();

            	    state._fsp--;
            	    if (state.failed) return ref;

            	    if ( state.backtracking==0 ) {
            	            ref.getIds().add(id);
            	          }

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ref;
    }
    // $ANTLR end "reference"



    // $ANTLR start "array_identifier"
    // AadlBa.g:1681:1: array_identifier returns [ArrayableIdentifier id] : identifier= IDENT ( LBRACK Val= integer_value RBRACK )* ;
    public final ArrayableIdentifier array_identifier() throws RecognitionException {
        ArrayableIdentifier id = null;


        Token identifier=null;
        IntegerValue Val =null;



          id = _decl.createArrayableIdentifier() ;

        try {
            // AadlBa.g:1686:3: (identifier= IDENT ( LBRACK Val= integer_value RBRACK )* )
            // AadlBa.g:1687:5: identifier= IDENT ( LBRACK Val= integer_value RBRACK )*
            {
            identifier=(Token)match(input,IDENT,FOLLOW_IDENT_in_array_identifier5394); if (state.failed) return id;

            if ( state.backtracking==0 ) {
                  id.setId(identifier.getText());    
                  setLocationReference(id, identifier); 
                }

            // AadlBa.g:1692:5: ( LBRACK Val= integer_value RBRACK )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==LBRACK) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // AadlBa.g:1693:7: LBRACK Val= integer_value RBRACK
            	    {
            	    match(input,LBRACK,FOLLOW_LBRACK_in_array_identifier5414); if (state.failed) return id;

            	    pushFollow(FOLLOW_integer_value_in_array_identifier5418);
            	    Val=integer_value();

            	    state._fsp--;
            	    if (state.failed) return id;

            	    match(input,RBRACK,FOLLOW_RBRACK_in_array_identifier5420); if (state.failed) return id;

            	    if ( state.backtracking==0 ) {
            	            id.getArrayIndexes().add(Val);
            	          }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return id;
    }
    // $ANTLR end "array_identifier"



    // $ANTLR start "fact_value"
    // AadlBa.g:1857:1: fact_value returns [Value Val] : ( (id1= IDENT DOUBLECOLON id2= IDENT ) |ValueVar= value_variable |bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal ) ;
    public final Value fact_value() throws RecognitionException {
        Value Val = null;


        Token id1=null;
        Token id2=null;
        ValueVariable ValueVar =null;

        BehaviorBooleanLiteral bl =null;

        NumericLiteral nl =null;

        BehaviorStringLiteral st =null;

        Enumeration lit =null;



           Val = null ;
         
        try {
            // AadlBa.g:1862:3: ( ( (id1= IDENT DOUBLECOLON id2= IDENT ) |ValueVar= value_variable |bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal ) )
            // AadlBa.g:1865:4: ( (id1= IDENT DOUBLECOLON id2= IDENT ) |ValueVar= value_variable |bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal )
            {
            // AadlBa.g:1865:4: ( (id1= IDENT DOUBLECOLON id2= IDENT ) |ValueVar= value_variable |bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal )
            int alt53=6;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case DOUBLECOLON:
                    {
                    int LA53_5 = input.LA(3);

                    if ( (LA53_5==IDENT) ) {
                        int LA53_8 = input.LA(4);

                        if ( (LA53_8==DOT||LA53_8==DOUBLECOLON) ) {
                            alt53=6;
                        }
                        else if ( (LA53_8==EOF||LA53_8==AND||LA53_8==COMMA||LA53_8==CONCAT||LA53_8==DIVIDE||LA53_8==DOTDOT||(LA53_8 >= ELSE && LA53_8 <= END)||LA53_8==EQUAL||(LA53_8 >= GREATEROREQUAL && LA53_8 <= GREATERTHAN)||LA53_8==IDENT||(LA53_8 >= LESSOREQUAL && LA53_8 <= LESSTHAN)||(LA53_8 >= MINUS && LA53_8 <= MOD)||LA53_8==NOTEQUAL||LA53_8==OR||(LA53_8 >= PLUS && LA53_8 <= RCURLY)||(LA53_8 >= REM && LA53_8 <= SEMICOLON)||(LA53_8 >= STAR && LA53_8 <= STARSTAR)||LA53_8==UNTIL||LA53_8==XOR) ) {
                            alt53=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return Val;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 53, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return Val;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case EOF:
                case AND:
                case COMMA:
                case CONCAT:
                case DIVIDE:
                case DOTDOT:
                case ELSE:
                case ELSIF:
                case END:
                case EQUAL:
                case GREATEROREQUAL:
                case GREATERTHAN:
                case IDENT:
                case INTERROG:
                case LBRACK:
                case LESSOREQUAL:
                case LESSTHAN:
                case MINUS:
                case MOD:
                case NOTEQUAL:
                case OR:
                case PLUS:
                case RBRACK:
                case RCURLY:
                case REM:
                case RPAREN:
                case RTRANS:
                case SEMICOLON:
                case STAR:
                case STARSTAR:
                case TICK:
                case UNTIL:
                case XOR:
                    {
                    alt53=2;
                    }
                    break;
                case DOT:
                    {
                    int LA53_7 = input.LA(3);

                    if ( (LA53_7==IDENT) ) {
                        int LA53_9 = input.LA(4);

                        if ( (LA53_9==DOT) ) {
                            int LA53_12 = input.LA(5);

                            if ( (LA53_12==ENUMERATOR) ) {
                                alt53=6;
                            }
                            else if ( (LA53_12==IDENT) ) {
                                alt53=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return Val;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 53, 12, input);

                                throw nvae;

                            }
                        }
                        else if ( (LA53_9==EOF||LA53_9==AND||LA53_9==COMMA||LA53_9==CONCAT||LA53_9==DIVIDE||LA53_9==DOTDOT||(LA53_9 >= ELSE && LA53_9 <= END)||LA53_9==EQUAL||(LA53_9 >= GREATEROREQUAL && LA53_9 <= GREATERTHAN)||LA53_9==IDENT||LA53_9==INTERROG||LA53_9==LBRACK||(LA53_9 >= LESSOREQUAL && LA53_9 <= LESSTHAN)||(LA53_9 >= MINUS && LA53_9 <= MOD)||LA53_9==NOTEQUAL||LA53_9==OR||(LA53_9 >= PLUS && LA53_9 <= RCURLY)||(LA53_9 >= REM && LA53_9 <= SEMICOLON)||(LA53_9 >= STAR && LA53_9 <= STARSTAR)||LA53_9==TICK||LA53_9==UNTIL||LA53_9==XOR) ) {
                            alt53=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return Val;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 53, 9, input);

                            throw nvae;

                        }
                    }
                    else if ( (LA53_7==ENUMERATOR) ) {
                        alt53=6;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return Val;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 7, input);

                        throw nvae;

                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return Val;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;

                }

                }
                break;
            case FALSE:
            case TRUE:
                {
                alt53=3;
                }
                break;
            case INTEGER_LIT:
            case REAL_LIT:
                {
                alt53=4;
                }
                break;
            case STRING_LITERAL:
                {
                alt53=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return Val;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }

            switch (alt53) {
                case 1 :
                    // AadlBa.g:1867:8: (id1= IDENT DOUBLECOLON id2= IDENT )
                    {
                    // AadlBa.g:1867:8: (id1= IDENT DOUBLECOLON id2= IDENT )
                    // AadlBa.g:1868:11: id1= IDENT DOUBLECOLON id2= IDENT
                    {
                    id1=(Token)match(input,IDENT,FOLLOW_IDENT_in_fact_value5530); if (state.failed) return Val;

                    match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_fact_value5532); if (state.failed) return Val;

                    id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_fact_value5536); if (state.failed) return Val;

                    if ( state.backtracking==0 ) {
                                QualifiedNamedElement property = _decl.
                                                                   createQualifiedNamedElement();
                                            
                                Identifier nameSpaceId = _decl.createIdentifier();
                                nameSpaceId.setId(id1.getText());
                                setLocationReference(nameSpaceId, id1);
                                property.setBaNamespace(nameSpaceId);
                                
                                setLocationReference(property, id1) ;
                                
                                Identifier nameId = _decl.createIdentifier();
                                nameId.setId(id2.getText());
                                setLocationReference(nameId, id2);
                                property.setBaName(nameId);
                                
                                Val = property ;
                              }

                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:1889:8: ValueVar= value_variable
                    {
                    pushFollow(FOLLOW_value_variable_in_fact_value5576);
                    ValueVar=value_variable();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = ValueVar ;}

                    }
                    break;
                case 3 :
                    // AadlBa.g:1892:8: bl= boolean_literal
                    {
                    pushFollow(FOLLOW_boolean_literal_in_fact_value5598);
                    bl=boolean_literal();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = bl;}

                    }
                    break;
                case 4 :
                    // AadlBa.g:1894:8: nl= numeric_literal
                    {
                    pushFollow(FOLLOW_numeric_literal_in_fact_value5618);
                    nl=numeric_literal();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = nl;}

                    }
                    break;
                case 5 :
                    // AadlBa.g:1896:8: st= string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_fact_value5638);
                    st=string_literal();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = st;}

                    }
                    break;
                case 6 :
                    // AadlBa.g:1898:8: lit= behavior_enumeration_literal
                    {
                    pushFollow(FOLLOW_behavior_enumeration_literal_in_fact_value5659);
                    lit=behavior_enumeration_literal();

                    state._fsp--;
                    if (state.failed) return Val;

                    if ( state.backtracking==0 ) { Val = lit ;}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Val;
    }
    // $ANTLR end "fact_value"



    // $ANTLR start "value"
    // AadlBa.g:1919:1: value returns [Value Val] : ( (ValTmp= fact_value ) | (identifier= LPAREN ValExpr= value_expression RPAREN ) ) ;
    public final Value value() throws RecognitionException {
        Value Val = null;


        Token identifier=null;
        Value ValTmp =null;

        ValueExpression ValExpr =null;



         
        try {
            // AadlBa.g:1922:3: ( ( (ValTmp= fact_value ) | (identifier= LPAREN ValExpr= value_expression RPAREN ) ) )
            // AadlBa.g:1923:4: ( (ValTmp= fact_value ) | (identifier= LPAREN ValExpr= value_expression RPAREN ) )
            {
            // AadlBa.g:1923:4: ( (ValTmp= fact_value ) | (identifier= LPAREN ValExpr= value_expression RPAREN ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==FALSE||LA54_0==IDENT||LA54_0==INTEGER_LIT||LA54_0==REAL_LIT||LA54_0==STRING_LITERAL||LA54_0==TRUE) ) {
                alt54=1;
            }
            else if ( (LA54_0==LPAREN) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return Val;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // AadlBa.g:1924:8: (ValTmp= fact_value )
                    {
                    // AadlBa.g:1924:8: (ValTmp= fact_value )
                    // AadlBa.g:1924:10: ValTmp= fact_value
                    {
                    pushFollow(FOLLOW_fact_value_in_value5720);
                    ValTmp=fact_value();

                    state._fsp--;
                    if (state.failed) return Val;

                    }


                    if ( state.backtracking==0 ) {Val = ValTmp;}

                    }
                    break;
                case 2 :
                    // AadlBa.g:1926:8: (identifier= LPAREN ValExpr= value_expression RPAREN )
                    {
                    // AadlBa.g:1926:8: (identifier= LPAREN ValExpr= value_expression RPAREN )
                    // AadlBa.g:1926:10: identifier= LPAREN ValExpr= value_expression RPAREN
                    {
                    identifier=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value5744); if (state.failed) return Val;

                    pushFollow(FOLLOW_value_expression_in_value5748);
                    ValExpr=value_expression();

                    state._fsp--;
                    if (state.failed) return Val;

                    match(input,RPAREN,FOLLOW_RPAREN_in_value5750); if (state.failed) return Val;

                    if ( state.backtracking==0 ) { setLocationReference(ValExpr, identifier) ; Val = ValExpr; }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Val;
    }
    // $ANTLR end "value"



    // $ANTLR start "value_variable"
    // AadlBa.g:1945:1: value_variable returns [ValueVariable ValueVar] : (ref= reference ( INTERROG | TICK ( COUNT | FRESH ) )? ) ;
    public final ValueVariable value_variable() throws RecognitionException {
        ValueVariable ValueVar = null;


        Reference ref =null;



           ValueVar = null ;
         
        try {
            // AadlBa.g:1950:3: ( (ref= reference ( INTERROG | TICK ( COUNT | FRESH ) )? ) )
            // AadlBa.g:1953:6: (ref= reference ( INTERROG | TICK ( COUNT | FRESH ) )? )
            {
            // AadlBa.g:1953:6: (ref= reference ( INTERROG | TICK ( COUNT | FRESH ) )? )
            // AadlBa.g:1954:8: ref= reference ( INTERROG | TICK ( COUNT | FRESH ) )?
            {
            pushFollow(FOLLOW_reference_in_value_variable5838);
            ref=reference();

            state._fsp--;
            if (state.failed) return ValueVar;

            // AadlBa.g:1956:8: ( INTERROG | TICK ( COUNT | FRESH ) )?
            int alt56=3;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==INTERROG) ) {
                alt56=1;
            }
            else if ( (LA56_0==TICK) ) {
                alt56=2;
            }
            switch (alt56) {
                case 1 :
                    // AadlBa.g:1957:12: INTERROG
                    {
                    match(input,INTERROG,FOLLOW_INTERROG_in_value_variable5868); if (state.failed) return ValueVar;

                    if ( state.backtracking==0 ) {
                                 NamedValue nv = _decl.createNamedValue();
                                 nv.setReference(ref) ;
                                 nv.setDequeue(true);
                                 nv.setLocationReference(ref.getLocationReference());
                                 ValueVar = nv ;
                               }

                    }
                    break;
                case 2 :
                    // AadlBa.g:1966:12: TICK ( COUNT | FRESH )
                    {
                    match(input,TICK,FOLLOW_TICK_in_value_variable5905); if (state.failed) return ValueVar;

                    // AadlBa.g:1966:17: ( COUNT | FRESH )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==COUNT) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==FRESH) ) {
                        alt55=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ValueVar;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;

                    }
                    switch (alt55) {
                        case 1 :
                            // AadlBa.g:1967:21: COUNT
                            {
                            match(input,COUNT,FOLLOW_COUNT_in_value_variable5929); if (state.failed) return ValueVar;

                            if ( state.backtracking==0 ) { 
                                                  NamedValue nv = _decl.createNamedValue();
                                                  nv.setReference(ref) ;
                                                  nv.setCount(true);
                                                   nv.setLocationReference(ref.getLocationReference());
                                                  ValueVar = nv ;
                                                }

                            }
                            break;
                        case 2 :
                            // AadlBa.g:1976:21: FRESH
                            {
                            match(input,FRESH,FOLLOW_FRESH_in_value_variable5996); if (state.failed) return ValueVar;

                            if ( state.backtracking==0 ) {
                                                  NamedValue nv = _decl.createNamedValue();
                                                  nv.setReference(ref) ;
                                                  nv.setFresh(true);
                                                   nv.setLocationReference(ref.getLocationReference());
                                                  ValueVar = nv ;
                                                }

                            }
                            break;

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                     if (ValueVar == null)
                     {
                       ValueVar = ref ;
                     }
                   }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ValueVar;
    }
    // $ANTLR end "value_variable"



    // $ANTLR start "value_constant"
    // AadlBa.g:2145:1: value_constant returns [ValueConstant ValueCons] : (bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal |prop= property ) ;
    public final ValueConstant value_constant() throws RecognitionException {
        ValueConstant ValueCons = null;


        BehaviorBooleanLiteral bl =null;

        NumericLiteral nl =null;

        BehaviorStringLiteral st =null;

        Enumeration lit =null;

        QualifiedNamedElement prop =null;



         
        try {
            // AadlBa.g:2148:3: ( (bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal |prop= property ) )
            // AadlBa.g:2150:4: (bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal |prop= property )
            {
            // AadlBa.g:2150:4: (bl= boolean_literal |nl= numeric_literal |st= string_literal |lit= behavior_enumeration_literal |prop= property )
            int alt57=5;
            switch ( input.LA(1) ) {
            case FALSE:
            case TRUE:
                {
                alt57=1;
                }
                break;
            case INTEGER_LIT:
            case REAL_LIT:
                {
                alt57=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt57=3;
                }
                break;
            case IDENT:
                {
                switch ( input.LA(2) ) {
                case DOUBLECOLON:
                    {
                    int LA57_5 = input.LA(3);

                    if ( (LA57_5==IDENT) ) {
                        int LA57_8 = input.LA(4);

                        if ( (LA57_8==DOT||LA57_8==DOUBLECOLON) ) {
                            alt57=4;
                        }
                        else if ( (LA57_8==EOF) ) {
                            alt57=5;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ValueCons;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 57, 8, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ValueCons;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 5, input);

                        throw nvae;

                    }
                    }
                    break;
                case DOT:
                    {
                    alt57=4;
                    }
                    break;
                case EOF:
                    {
                    alt57=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ValueCons;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 4, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ValueCons;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // AadlBa.g:2151:8: bl= boolean_literal
                    {
                    pushFollow(FOLLOW_boolean_literal_in_value_constant6119);
                    bl=boolean_literal();

                    state._fsp--;
                    if (state.failed) return ValueCons;

                    if ( state.backtracking==0 ) { ValueCons = bl; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:2153:8: nl= numeric_literal
                    {
                    pushFollow(FOLLOW_numeric_literal_in_value_constant6139);
                    nl=numeric_literal();

                    state._fsp--;
                    if (state.failed) return ValueCons;

                    if ( state.backtracking==0 ) { ValueCons = nl; }

                    }
                    break;
                case 3 :
                    // AadlBa.g:2155:8: st= string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_value_constant6159);
                    st=string_literal();

                    state._fsp--;
                    if (state.failed) return ValueCons;

                    if ( state.backtracking==0 ) { ValueCons = st; }

                    }
                    break;
                case 4 :
                    // AadlBa.g:2157:8: lit= behavior_enumeration_literal
                    {
                    pushFollow(FOLLOW_behavior_enumeration_literal_in_value_constant6179);
                    lit=behavior_enumeration_literal();

                    state._fsp--;
                    if (state.failed) return ValueCons;

                    if ( state.backtracking==0 ) { ValueCons = lit ;}

                    }
                    break;
                case 5 :
                    // AadlBa.g:2160:8: prop= property
                    {
                    pushFollow(FOLLOW_property_in_value_constant6207);
                    prop=property();

                    state._fsp--;
                    if (state.failed) return ValueCons;

                    if ( state.backtracking==0 ) {ValueCons = prop ;}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ValueCons;
    }
    // $ANTLR end "value_constant"



    // $ANTLR start "value_expression"
    // AadlBa.g:2179:1: value_expression returns [ValueExpression ValueExpr] : (Rel= relation (LogicalOp= logical_operator Rel= relation )* ) ;
    public final ValueExpression value_expression() throws RecognitionException {
        ValueExpression ValueExpr = null;


        Relation Rel =null;

        LogicalOperator LogicalOp =null;



           ValueExpr = _fact.createValueExpression();
         
        try {
            // AadlBa.g:2183:3: ( (Rel= relation (LogicalOp= logical_operator Rel= relation )* ) )
            // AadlBa.g:2184:4: (Rel= relation (LogicalOp= logical_operator Rel= relation )* )
            {
            // AadlBa.g:2184:4: (Rel= relation (LogicalOp= logical_operator Rel= relation )* )
            // AadlBa.g:2185:6: Rel= relation (LogicalOp= logical_operator Rel= relation )*
            {
            pushFollow(FOLLOW_relation_in_value_expression6258);
            Rel=relation();

            state._fsp--;
            if (state.failed) return ValueExpr;

            if ( state.backtracking==0 ) { ValueExpr.getRelations().add(Rel);
                   ValueExpr.setLocationReference(Rel.getLocationReference());
                 }

            // AadlBa.g:2189:6: (LogicalOp= logical_operator Rel= relation )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==AND||LA58_0==OR||LA58_0==XOR) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // AadlBa.g:2190:8: LogicalOp= logical_operator Rel= relation
            	    {
            	    pushFollow(FOLLOW_logical_operator_in_value_expression6283);
            	    LogicalOp=logical_operator();

            	    state._fsp--;
            	    if (state.failed) return ValueExpr;

            	    pushFollow(FOLLOW_relation_in_value_expression6287);
            	    Rel=relation();

            	    state._fsp--;
            	    if (state.failed) return ValueExpr;

            	    if ( state.backtracking==0 ) {
            	            ValueExpr.getLogicalOperators().add(LogicalOp);
            	            ValueExpr.getRelations().add(Rel);
            	           }

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return ValueExpr;
    }
    // $ANTLR end "value_expression"



    // $ANTLR start "relation"
    // AadlBa.g:2207:1: relation returns [Relation Rel] : SimpleExpr= simple_expression (RelationalOp= relational_operator SimpleExpr= simple_expression )? ;
    public final Relation relation() throws RecognitionException {
        Relation Rel = null;


        SimpleExpression SimpleExpr =null;

        RelationalOperator RelationalOp =null;



           Rel = _fact.createRelation();
         
        try {
            // AadlBa.g:2211:3: (SimpleExpr= simple_expression (RelationalOp= relational_operator SimpleExpr= simple_expression )? )
            // AadlBa.g:2212:4: SimpleExpr= simple_expression (RelationalOp= relational_operator SimpleExpr= simple_expression )?
            {
            pushFollow(FOLLOW_simple_expression_in_relation6344);
            SimpleExpr=simple_expression();

            state._fsp--;
            if (state.failed) return Rel;

            if ( state.backtracking==0 ) { Rel.setFirstExpression(SimpleExpr);
                 Rel.setLocationReference(SimpleExpr.getLocationReference());  
               }

            // AadlBa.g:2216:4: (RelationalOp= relational_operator SimpleExpr= simple_expression )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==EQUAL||(LA59_0 >= GREATEROREQUAL && LA59_0 <= GREATERTHAN)||(LA59_0 >= LESSOREQUAL && LA59_0 <= LESSTHAN)||LA59_0==NOTEQUAL) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // AadlBa.g:2217:6: RelationalOp= relational_operator SimpleExpr= simple_expression
                    {
                    pushFollow(FOLLOW_relational_operator_in_relation6363);
                    RelationalOp=relational_operator();

                    state._fsp--;
                    if (state.failed) return Rel;

                    pushFollow(FOLLOW_simple_expression_in_relation6367);
                    SimpleExpr=simple_expression();

                    state._fsp--;
                    if (state.failed) return Rel;

                    if ( state.backtracking==0 ) {
                          Rel.setRelationalOperator(RelationalOp);
                          Rel.setSecondExpression(SimpleExpr);
                         }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Rel;
    }
    // $ANTLR end "relation"



    // $ANTLR start "simple_expression"
    // AadlBa.g:2233:1: simple_expression returns [SimpleExpression SimpleExpr] : (UnaryAddOp= unary_adding_operator )? tm= term (BinaryAddOp= binary_adding_operator tm= term )* ;
    public final SimpleExpression simple_expression() throws RecognitionException {
        SimpleExpression SimpleExpr = null;


        UnaryAddingOperator UnaryAddOp =null;

        Term tm =null;

        BinaryAddingOperator BinaryAddOp =null;



           SimpleExpr = _fact.createSimpleExpression();
         
        try {
            // AadlBa.g:2237:3: ( (UnaryAddOp= unary_adding_operator )? tm= term (BinaryAddOp= binary_adding_operator tm= term )* )
            // AadlBa.g:2238:4: (UnaryAddOp= unary_adding_operator )? tm= term (BinaryAddOp= binary_adding_operator tm= term )*
            {
            // AadlBa.g:2238:4: (UnaryAddOp= unary_adding_operator )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==MINUS||LA60_0==PLUS) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // AadlBa.g:2239:6: UnaryAddOp= unary_adding_operator
                    {
                    pushFollow(FOLLOW_unary_adding_operator_in_simple_expression6422);
                    UnaryAddOp=unary_adding_operator();

                    state._fsp--;
                    if (state.failed) return SimpleExpr;

                    if ( state.backtracking==0 ) {
                          SimpleExpr.setUnaryAddingOperator(UnaryAddOp);
                         }

                    }
                    break;

            }


            pushFollow(FOLLOW_term_in_simple_expression6447);
            tm=term();

            state._fsp--;
            if (state.failed) return SimpleExpr;

            if ( state.backtracking==0 ) { 
                 SimpleExpr.getTerms().add(tm);
                 SimpleExpr.setLocationReference(tm.getLocationReference());
               }

            // AadlBa.g:2251:4: (BinaryAddOp= binary_adding_operator tm= term )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==MINUS||LA61_0==PLUS) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // AadlBa.g:2252:6: BinaryAddOp= binary_adding_operator tm= term
            	    {
            	    pushFollow(FOLLOW_binary_adding_operator_in_simple_expression6470);
            	    BinaryAddOp=binary_adding_operator();

            	    state._fsp--;
            	    if (state.failed) return SimpleExpr;

            	    pushFollow(FOLLOW_term_in_simple_expression6474);
            	    tm=term();

            	    state._fsp--;
            	    if (state.failed) return SimpleExpr;

            	    if ( state.backtracking==0 ) {
            	          SimpleExpr.getBinaryAddingOperators().add(BinaryAddOp);
            	          SimpleExpr.getTerms().add(tm);
            	         }

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return SimpleExpr;
    }
    // $ANTLR end "simple_expression"



    // $ANTLR start "term"
    // AadlBa.g:2267:1: term returns [Term tm] : fact= factor (MultiplyingOp= multiplying_operator fact= factor )* ;
    public final Term term() throws RecognitionException {
        Term tm = null;


        Factor fact =null;

        MultiplyingOperator MultiplyingOp =null;



           tm = _fact.createTerm();
         
        try {
            // AadlBa.g:2271:3: (fact= factor (MultiplyingOp= multiplying_operator fact= factor )* )
            // AadlBa.g:2272:4: fact= factor (MultiplyingOp= multiplying_operator fact= factor )*
            {
            pushFollow(FOLLOW_factor_in_term6521);
            fact=factor();

            state._fsp--;
            if (state.failed) return tm;

            if ( state.backtracking==0 ) { tm.getFactors().add(fact);
                 tm.setLocationReference(fact.getLocationReference());
               }

            // AadlBa.g:2276:4: (MultiplyingOp= multiplying_operator fact= factor )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==DIVIDE||LA62_0==MOD||LA62_0==REM||LA62_0==STAR) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // AadlBa.g:2277:6: MultiplyingOp= multiplying_operator fact= factor
            	    {
            	    pushFollow(FOLLOW_multiplying_operator_in_term6540);
            	    MultiplyingOp=multiplying_operator();

            	    state._fsp--;
            	    if (state.failed) return tm;

            	    pushFollow(FOLLOW_factor_in_term6544);
            	    fact=factor();

            	    state._fsp--;
            	    if (state.failed) return tm;

            	    if ( state.backtracking==0 ) {
            	          tm.getMultiplyingOperators().add(MultiplyingOp);
            	          tm.getFactors().add(fact);
            	         }

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return tm;
    }
    // $ANTLR end "term"



    // $ANTLR start "factor"
    // AadlBa.g:2295:1: factor returns [Factor Fact] : ( (val= value (BinaryNumOp= binary_numeric_operator val2= value )? ) | (UnaryNumOp= unary_numeric_operator val= value ) | (UnaryBoolOp= unary_boolean_operator val= value ) ) ;
    public final Factor factor() throws RecognitionException {
        Factor Fact = null;


        Value val =null;

        BinaryNumericOperator BinaryNumOp =null;

        Value val2 =null;

        UnaryNumericOperator UnaryNumOp =null;

        UnaryBooleanOperator UnaryBoolOp =null;



           Fact = _fact.createFactor();
         
        try {
            // AadlBa.g:2300:3: ( ( (val= value (BinaryNumOp= binary_numeric_operator val2= value )? ) | (UnaryNumOp= unary_numeric_operator val= value ) | (UnaryBoolOp= unary_boolean_operator val= value ) ) )
            // AadlBa.g:2301:4: ( (val= value (BinaryNumOp= binary_numeric_operator val2= value )? ) | (UnaryNumOp= unary_numeric_operator val= value ) | (UnaryBoolOp= unary_boolean_operator val= value ) )
            {
            // AadlBa.g:2301:4: ( (val= value (BinaryNumOp= binary_numeric_operator val2= value )? ) | (UnaryNumOp= unary_numeric_operator val= value ) | (UnaryBoolOp= unary_boolean_operator val= value ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case FALSE:
            case IDENT:
            case INTEGER_LIT:
            case LPAREN:
            case REAL_LIT:
            case STRING_LITERAL:
            case TRUE:
                {
                alt64=1;
                }
                break;
            case ABS:
                {
                alt64=2;
                }
                break;
            case NOT:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return Fact;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // AadlBa.g:2302:5: (val= value (BinaryNumOp= binary_numeric_operator val2= value )? )
                    {
                    // AadlBa.g:2302:5: (val= value (BinaryNumOp= binary_numeric_operator val2= value )? )
                    // AadlBa.g:2302:7: val= value (BinaryNumOp= binary_numeric_operator val2= value )?
                    {
                    pushFollow(FOLLOW_value_in_factor6604);
                    val=value();

                    state._fsp--;
                    if (state.failed) return Fact;

                    if ( state.backtracking==0 ) {
                                      Fact.setLocationReference(val.getLocationReference()) ;
                                      Fact.setFirstValue(val);
                                    }

                    // AadlBa.g:2306:7: (BinaryNumOp= binary_numeric_operator val2= value )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==STARSTAR) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // AadlBa.g:2307:9: BinaryNumOp= binary_numeric_operator val2= value
                            {
                            pushFollow(FOLLOW_binary_numeric_operator_in_factor6627);
                            BinaryNumOp=binary_numeric_operator();

                            state._fsp--;
                            if (state.failed) return Fact;

                            pushFollow(FOLLOW_value_in_factor6631);
                            val2=value();

                            state._fsp--;
                            if (state.failed) return Fact;

                            if ( state.backtracking==0 ) {
                                      Fact.setBinaryNumericOperator(BinaryNumOp);
                                      Fact.setSecondValue(val2);
                                    }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // AadlBa.g:2315:5: (UnaryNumOp= unary_numeric_operator val= value )
                    {
                    // AadlBa.g:2315:5: (UnaryNumOp= unary_numeric_operator val= value )
                    // AadlBa.g:2315:7: UnaryNumOp= unary_numeric_operator val= value
                    {
                    pushFollow(FOLLOW_unary_numeric_operator_in_factor6671);
                    UnaryNumOp=unary_numeric_operator();

                    state._fsp--;
                    if (state.failed) return Fact;

                    pushFollow(FOLLOW_value_in_factor6675);
                    val=value();

                    state._fsp--;
                    if (state.failed) return Fact;

                    if ( state.backtracking==0 ) {
                             Fact.setUnaryNumericOperator(UnaryNumOp);
                             Fact.setFirstValue(val);
                             Fact.setLocationReference(val.getLocationReference()) ;
                          }

                    }


                    }
                    break;
                case 3 :
                    // AadlBa.g:2323:5: (UnaryBoolOp= unary_boolean_operator val= value )
                    {
                    // AadlBa.g:2323:5: (UnaryBoolOp= unary_boolean_operator val= value )
                    // AadlBa.g:2323:7: UnaryBoolOp= unary_boolean_operator val= value
                    {
                    pushFollow(FOLLOW_unary_boolean_operator_in_factor6704);
                    UnaryBoolOp=unary_boolean_operator();

                    state._fsp--;
                    if (state.failed) return Fact;

                    pushFollow(FOLLOW_value_in_factor6708);
                    val=value();

                    state._fsp--;
                    if (state.failed) return Fact;

                    if ( state.backtracking==0 ) {
                             Fact.setUnaryBooleanOperator(UnaryBoolOp);
                             Fact.setFirstValue(val);
                             Fact.setLocationReference(val.getLocationReference()) ;
                          }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Fact;
    }
    // $ANTLR end "factor"



    // $ANTLR start "logical_operator"
    // AadlBa.g:2339:1: logical_operator returns [LogicalOperator LogicalOp] : ( AND | OR | XOR ) ;
    public final LogicalOperator logical_operator() throws RecognitionException {
        LogicalOperator LogicalOp = null;



         // TODO location reference
           LogicalOp = null;
         
        try {
            // AadlBa.g:2344:3: ( ( AND | OR | XOR ) )
            // AadlBa.g:2345:4: ( AND | OR | XOR )
            {
            // AadlBa.g:2345:4: ( AND | OR | XOR )
            int alt65=3;
            switch ( input.LA(1) ) {
            case AND:
                {
                alt65=1;
                }
                break;
            case OR:
                {
                alt65=2;
                }
                break;
            case XOR:
                {
                alt65=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return LogicalOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }

            switch (alt65) {
                case 1 :
                    // AadlBa.g:2346:6: AND
                    {
                    match(input,AND,FOLLOW_AND_in_logical_operator6764); if (state.failed) return LogicalOp;

                    if ( state.backtracking==0 ) { LogicalOp=LogicalOperator.AND; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:2348:6: OR
                    {
                    match(input,OR,FOLLOW_OR_in_logical_operator6778); if (state.failed) return LogicalOp;

                    if ( state.backtracking==0 ) { LogicalOp=LogicalOperator.OR; }

                    }
                    break;
                case 3 :
                    // AadlBa.g:2350:6: XOR
                    {
                    match(input,XOR,FOLLOW_XOR_in_logical_operator6792); if (state.failed) return LogicalOp;

                    if ( state.backtracking==0 ) { LogicalOp=LogicalOperator.XOR; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return LogicalOp;
    }
    // $ANTLR end "logical_operator"



    // $ANTLR start "relational_operator"
    // AadlBa.g:2361:1: relational_operator returns [RelationalOperator RelationalOp] : ( EQUAL | NOTEQUAL | LESSTHAN | LESSOREQUAL | GREATERTHAN | GREATEROREQUAL ) ;
    public final RelationalOperator relational_operator() throws RecognitionException {
        RelationalOperator RelationalOp = null;



         // TODO location reference
           RelationalOp = null;
         
        try {
            // AadlBa.g:2366:3: ( ( EQUAL | NOTEQUAL | LESSTHAN | LESSOREQUAL | GREATERTHAN | GREATEROREQUAL ) )
            // AadlBa.g:2367:4: ( EQUAL | NOTEQUAL | LESSTHAN | LESSOREQUAL | GREATERTHAN | GREATEROREQUAL )
            {
            // AadlBa.g:2367:4: ( EQUAL | NOTEQUAL | LESSTHAN | LESSOREQUAL | GREATERTHAN | GREATEROREQUAL )
            int alt66=6;
            switch ( input.LA(1) ) {
            case EQUAL:
                {
                alt66=1;
                }
                break;
            case NOTEQUAL:
                {
                alt66=2;
                }
                break;
            case LESSTHAN:
                {
                alt66=3;
                }
                break;
            case LESSOREQUAL:
                {
                alt66=4;
                }
                break;
            case GREATERTHAN:
                {
                alt66=5;
                }
                break;
            case GREATEROREQUAL:
                {
                alt66=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return RelationalOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }

            switch (alt66) {
                case 1 :
                    // AadlBa.g:2368:6: EQUAL
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_relational_operator6837); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.EQUAL; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:2370:6: NOTEQUAL
                    {
                    match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_relational_operator6851); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.NOT_EQUAL; }

                    }
                    break;
                case 3 :
                    // AadlBa.g:2372:6: LESSTHAN
                    {
                    match(input,LESSTHAN,FOLLOW_LESSTHAN_in_relational_operator6865); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.LESS_THAN; }

                    }
                    break;
                case 4 :
                    // AadlBa.g:2374:6: LESSOREQUAL
                    {
                    match(input,LESSOREQUAL,FOLLOW_LESSOREQUAL_in_relational_operator6879); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.LESS_OR_EQUAL_THAN; }

                    }
                    break;
                case 5 :
                    // AadlBa.g:2376:6: GREATERTHAN
                    {
                    match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_relational_operator6893); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.GREATER_THAN; }

                    }
                    break;
                case 6 :
                    // AadlBa.g:2378:6: GREATEROREQUAL
                    {
                    match(input,GREATEROREQUAL,FOLLOW_GREATEROREQUAL_in_relational_operator6907); if (state.failed) return RelationalOp;

                    if ( state.backtracking==0 ) { RelationalOp = RelationalOperator.GREATER_OR_EQUAL_THAN; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return RelationalOp;
    }
    // $ANTLR end "relational_operator"



    // $ANTLR start "binary_adding_operator"
    // AadlBa.g:2389:1: binary_adding_operator returns [BinaryAddingOperator BinaryAddOp] : ( PLUS | MINUS ) ;
    public final BinaryAddingOperator binary_adding_operator() throws RecognitionException {
        BinaryAddingOperator BinaryAddOp = null;



         // TODO location reference
           //BinaryAddOp = _fact.createBinaryAddingOperator();
         
        try {
            // AadlBa.g:2394:3: ( ( PLUS | MINUS ) )
            // AadlBa.g:2395:4: ( PLUS | MINUS )
            {
            // AadlBa.g:2395:4: ( PLUS | MINUS )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==PLUS) ) {
                alt67=1;
            }
            else if ( (LA67_0==MINUS) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return BinaryAddOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;

            }
            switch (alt67) {
                case 1 :
                    // AadlBa.g:2396:6: PLUS
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_binary_adding_operator6954); if (state.failed) return BinaryAddOp;

                    if ( state.backtracking==0 ) { BinaryAddOp = BinaryAddingOperator.PLUS; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:2398:6: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_binary_adding_operator6968); if (state.failed) return BinaryAddOp;

                    if ( state.backtracking==0 ) { BinaryAddOp = BinaryAddingOperator.MINUS; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BinaryAddOp;
    }
    // $ANTLR end "binary_adding_operator"



    // $ANTLR start "unary_adding_operator"
    // AadlBa.g:2409:1: unary_adding_operator returns [UnaryAddingOperator UnaryAddOp] : ( PLUS | MINUS ) ;
    public final UnaryAddingOperator unary_adding_operator() throws RecognitionException {
        UnaryAddingOperator UnaryAddOp = null;



         // TODO location reference
         
        try {
            // AadlBa.g:2413:3: ( ( PLUS | MINUS ) )
            // AadlBa.g:2414:4: ( PLUS | MINUS )
            {
            // AadlBa.g:2414:4: ( PLUS | MINUS )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==PLUS) ) {
                alt68=1;
            }
            else if ( (LA68_0==MINUS) ) {
                alt68=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return UnaryAddOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }
            switch (alt68) {
                case 1 :
                    // AadlBa.g:2415:6: PLUS
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unary_adding_operator7013); if (state.failed) return UnaryAddOp;

                    if ( state.backtracking==0 ) { UnaryAddOp = UnaryAddingOperator.PLUS; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:2417:6: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_unary_adding_operator7027); if (state.failed) return UnaryAddOp;

                    if ( state.backtracking==0 ) { UnaryAddOp = UnaryAddingOperator.MINUS; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return UnaryAddOp;
    }
    // $ANTLR end "unary_adding_operator"



    // $ANTLR start "multiplying_operator"
    // AadlBa.g:2428:1: multiplying_operator returns [MultiplyingOperator MultiplyingOp] : ( STAR | DIVIDE | MOD | REM ) ;
    public final MultiplyingOperator multiplying_operator() throws RecognitionException {
        MultiplyingOperator MultiplyingOp = null;



         // TODO location reference
          // MultiplyingOperator MultiplyingOp = null;
         
        try {
            // AadlBa.g:2433:3: ( ( STAR | DIVIDE | MOD | REM ) )
            // AadlBa.g:2434:4: ( STAR | DIVIDE | MOD | REM )
            {
            // AadlBa.g:2434:4: ( STAR | DIVIDE | MOD | REM )
            int alt69=4;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt69=1;
                }
                break;
            case DIVIDE:
                {
                alt69=2;
                }
                break;
            case MOD:
                {
                alt69=3;
                }
                break;
            case REM:
                {
                alt69=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return MultiplyingOp;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }

            switch (alt69) {
                case 1 :
                    // AadlBa.g:2435:6: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplying_operator7072); if (state.failed) return MultiplyingOp;

                    if ( state.backtracking==0 ) { MultiplyingOp = MultiplyingOperator.MULTIPLY; }

                    }
                    break;
                case 2 :
                    // AadlBa.g:2437:6: DIVIDE
                    {
                    match(input,DIVIDE,FOLLOW_DIVIDE_in_multiplying_operator7086); if (state.failed) return MultiplyingOp;

                    if ( state.backtracking==0 ) { MultiplyingOp = MultiplyingOperator.DIVIDE; }

                    }
                    break;
                case 3 :
                    // AadlBa.g:2439:6: MOD
                    {
                    match(input,MOD,FOLLOW_MOD_in_multiplying_operator7100); if (state.failed) return MultiplyingOp;

                    if ( state.backtracking==0 ) { MultiplyingOp = MultiplyingOperator.MOD; }

                    }
                    break;
                case 4 :
                    // AadlBa.g:2441:6: REM
                    {
                    match(input,REM,FOLLOW_REM_in_multiplying_operator7114); if (state.failed) return MultiplyingOp;

                    if ( state.backtracking==0 ) { MultiplyingOp = MultiplyingOperator.REM; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return MultiplyingOp;
    }
    // $ANTLR end "multiplying_operator"



    // $ANTLR start "binary_numeric_operator"
    // AadlBa.g:2452:1: binary_numeric_operator returns [BinaryNumericOperator BinaryNumOp] : STARSTAR ;
    public final BinaryNumericOperator binary_numeric_operator() throws RecognitionException {
        BinaryNumericOperator BinaryNumOp = null;



         // TODO location reference
           //BinaryNumericOperator BinaryNumOp = null;
         
        try {
            // AadlBa.g:2457:3: ( STARSTAR )
            // AadlBa.g:2458:4: STARSTAR
            {
            match(input,STARSTAR,FOLLOW_STARSTAR_in_binary_numeric_operator7152); if (state.failed) return BinaryNumOp;

            if ( state.backtracking==0 ) { BinaryNumOp = BinaryNumericOperator.MULTIPLY_MULTIPLY; }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BinaryNumOp;
    }
    // $ANTLR end "binary_numeric_operator"



    // $ANTLR start "unary_numeric_operator"
    // AadlBa.g:2468:1: unary_numeric_operator returns [UnaryNumericOperator UnaryNumOp] : ABS ;
    public final UnaryNumericOperator unary_numeric_operator() throws RecognitionException {
        UnaryNumericOperator UnaryNumOp = null;



         // TODO location reference
           //UnaryNumericOperator UnaryNumOp = null;
         
        try {
            // AadlBa.g:2473:3: ( ABS )
            // AadlBa.g:2474:4: ABS
            {
            match(input,ABS,FOLLOW_ABS_in_unary_numeric_operator7185); if (state.failed) return UnaryNumOp;

            if ( state.backtracking==0 ) { UnaryNumOp = UnaryNumericOperator.ABS; }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return UnaryNumOp;
    }
    // $ANTLR end "unary_numeric_operator"



    // $ANTLR start "unary_boolean_operator"
    // AadlBa.g:2484:1: unary_boolean_operator returns [UnaryBooleanOperator UnaryBoolOp] : NOT ;
    public final UnaryBooleanOperator unary_boolean_operator() throws RecognitionException {
        UnaryBooleanOperator UnaryBoolOp = null;



         // TODO location reference
           //UnaryBooleanOperator UnaryBoolOp = null;
         
        try {
            // AadlBa.g:2489:3: ( NOT )
            // AadlBa.g:2490:4: NOT
            {
            match(input,NOT,FOLLOW_NOT_in_unary_boolean_operator7218); if (state.failed) return UnaryBoolOp;

            if ( state.backtracking==0 ) { UnaryBoolOp = UnaryBooleanOperator.NOT; }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return UnaryBoolOp;
    }
    // $ANTLR end "unary_boolean_operator"



    // $ANTLR start "boolean_literal"
    // AadlBa.g:2499:1: boolean_literal returns [BehaviorBooleanLiteral BoolLit] : (identifier= TRUE |identifier= FALSE ) ;
    public final BehaviorBooleanLiteral boolean_literal() throws RecognitionException {
        BehaviorBooleanLiteral BoolLit = null;


        Token identifier=null;


           BoolLit = _fact.createBehaviorBooleanLiteral();
         
        try {
            // AadlBa.g:2503:3: ( (identifier= TRUE |identifier= FALSE ) )
            // AadlBa.g:2504:4: (identifier= TRUE |identifier= FALSE )
            {
            // AadlBa.g:2504:4: (identifier= TRUE |identifier= FALSE )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==TRUE) ) {
                alt70=1;
            }
            else if ( (LA70_0==FALSE) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return BoolLit;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }
            switch (alt70) {
                case 1 :
                    // AadlBa.g:2505:8: identifier= TRUE
                    {
                    identifier=(Token)match(input,TRUE,FOLLOW_TRUE_in_boolean_literal7261); if (state.failed) return BoolLit;

                    if ( state.backtracking==0 ) { BoolLit.setValue(true);}

                    }
                    break;
                case 2 :
                    // AadlBa.g:2507:8: identifier= FALSE
                    {
                    identifier=(Token)match(input,FALSE,FOLLOW_FALSE_in_boolean_literal7281); if (state.failed) return BoolLit;

                    if ( state.backtracking==0 ) { BoolLit.setValue(false);}

                    }
                    break;

            }


            if ( state.backtracking==0 ) {setLocationReference(BoolLit, identifier) ;}

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BoolLit;
    }
    // $ANTLR end "boolean_literal"



    // $ANTLR start "integer_range"
    // AadlBa.g:2518:1: integer_range returns [IntegerRange IntRange] : (IntValue= integer_value DOTDOT IntValue2= integer_value ) ;
    public final IntegerRange integer_range() throws RecognitionException {
        IntegerRange IntRange = null;


        IntegerValue IntValue =null;

        IntegerValue IntValue2 =null;



           IntRange = _fact.createIntegerRange();
         
        try {
            // AadlBa.g:2522:3: ( (IntValue= integer_value DOTDOT IntValue2= integer_value ) )
            // AadlBa.g:2523:4: (IntValue= integer_value DOTDOT IntValue2= integer_value )
            {
            // AadlBa.g:2523:4: (IntValue= integer_value DOTDOT IntValue2= integer_value )
            // AadlBa.g:2524:6: IntValue= integer_value DOTDOT IntValue2= integer_value
            {
            pushFollow(FOLLOW_integer_value_in_integer_range7333);
            IntValue=integer_value();

            state._fsp--;
            if (state.failed) return IntRange;

            match(input,DOTDOT,FOLLOW_DOTDOT_in_integer_range7335); if (state.failed) return IntRange;

            pushFollow(FOLLOW_integer_value_in_integer_range7339);
            IntValue2=integer_value();

            state._fsp--;
            if (state.failed) return IntRange;

            if ( state.backtracking==0 ) {
                   IntRange.setLowerIntegerValue(IntValue);
                   IntRange.setUpperIntegerValue(IntValue2);
                   IntRange.setLocationReference(IntValue.getLocationReference());
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return IntRange;
    }
    // $ANTLR end "integer_range"



    // $ANTLR start "integer_value"
    // AadlBa.g:2541:1: integer_value returns [IntegerValue IntVal] : (ValTmp= fact_value ) ;
    public final IntegerValue integer_value() throws RecognitionException {
        IntegerValue IntVal = null;


        Value ValTmp =null;



         
        try {
            // AadlBa.g:2544:3: ( (ValTmp= fact_value ) )
            // AadlBa.g:2546:4: (ValTmp= fact_value )
            {
            // AadlBa.g:2546:4: (ValTmp= fact_value )
            // AadlBa.g:2547:6: ValTmp= fact_value
            {
            pushFollow(FOLLOW_fact_value_in_integer_value7398);
            ValTmp=fact_value();

            state._fsp--;
            if (state.failed) return IntVal;

            if ( state.backtracking==0 ) { IntVal = (IntegerValue) ValTmp ;}

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return IntVal;
    }
    // $ANTLR end "integer_value"



    // $ANTLR start "behavior_time"
    // AadlBa.g:2558:1: behavior_time returns [DeclarativeTime BehTime] : (IntValue= integer_value UnitIdent= IDENT ) ;
    public final DeclarativeTime behavior_time() throws RecognitionException {
        DeclarativeTime BehTime = null;


        Token UnitIdent=null;
        IntegerValue IntValue =null;



           BehTime = _decl.createDeclarativeTime() ;
         
        try {
            // AadlBa.g:2562:3: ( (IntValue= integer_value UnitIdent= IDENT ) )
            // AadlBa.g:2563:4: (IntValue= integer_value UnitIdent= IDENT )
            {
            // AadlBa.g:2563:4: (IntValue= integer_value UnitIdent= IDENT )
            // AadlBa.g:2564:6: IntValue= integer_value UnitIdent= IDENT
            {
            pushFollow(FOLLOW_integer_value_in_behavior_time7462);
            IntValue=integer_value();

            state._fsp--;
            if (state.failed) return BehTime;

            UnitIdent=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_time7466); if (state.failed) return BehTime;

            if ( state.backtracking==0 ) {
                   BehTime.setIntegerValue(IntValue);
                   BehTime.setLocationReference(IntValue.getLocationReference());
                   
                   Identifier Id = _decl.createIdentifier() ;
                   Id.setId(UnitIdent.getText());
                   setLocationReference(Id, UnitIdent) ;
                   BehTime.setUnitId(Id);
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return BehTime;
    }
    // $ANTLR end "behavior_time"



    // $ANTLR start "property"
    // AadlBa.g:2584:1: property returns [QualifiedNamedElement property] : ( (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT ) ;
    public final QualifiedNamedElement property() throws RecognitionException {
        QualifiedNamedElement property = null;


        Token PropertySetId=null;
        Token PropertyId=null;


           property = _decl.createQualifiedNamedElement();
         
        try {
            // AadlBa.g:2588:3: ( ( (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT ) )
            // AadlBa.g:2589:4: ( (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT )
            {
            // AadlBa.g:2589:4: ( (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT )
            // AadlBa.g:2590:6: (PropertySetId= IDENT DOUBLECOLON )? PropertyId= IDENT
            {
            // AadlBa.g:2590:6: (PropertySetId= IDENT DOUBLECOLON )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==IDENT) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==DOUBLECOLON) ) {
                    alt71=1;
                }
            }
            switch (alt71) {
                case 1 :
                    // AadlBa.g:2590:8: PropertySetId= IDENT DOUBLECOLON
                    {
                    PropertySetId=(Token)match(input,IDENT,FOLLOW_IDENT_in_property7520); if (state.failed) return property;

                    match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_property7522); if (state.failed) return property;

                    if ( state.backtracking==0 ) {
                             Identifier nameSpaceId = _decl.createIdentifier();
                             nameSpaceId.setId(PropertySetId.getText());
                             setLocationReference(nameSpaceId, PropertySetId); 
                             property.setBaNamespace(nameSpaceId);
                             setLocationReference(property, PropertySetId) ;
                           }

                    }
                    break;

            }


            PropertyId=(Token)match(input,IDENT,FOLLOW_IDENT_in_property7556); if (state.failed) return property;

            if ( state.backtracking==0 ) { 
                   Identifier nameId = _decl.createIdentifier();
                   nameId.setId(PropertyId.getText());
                   setLocationReference(nameId, PropertyId); 
                   property.setBaName(nameId);
                   
                   if (property.getLocationReference() == null )  
                   {
                     setLocationReference(property, PropertyId) ; 
                   }
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return property;
    }
    // $ANTLR end "property"



    // $ANTLR start "behavior_enumeration_literal"
    // AadlBa.g:2625:1: behavior_enumeration_literal returns [Enumeration enumeration] : ( qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT ) ;
    public final Enumeration behavior_enumeration_literal() throws RecognitionException {
        Enumeration enumeration = null;


        Token id1=null;
        Token id2=null;


                  enumeration = _decl.createEnumeration() ;
                
        try {
            // AadlBa.g:2629:3: ( ( qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT ) )
            // AadlBa.g:2630:3: ( qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT )
            {
            // AadlBa.g:2630:3: ( qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT )
            // AadlBa.g:2631:6: qualifiable_named_element[enumeration] DOT id1= ENUMERATOR HASH id2= IDENT
            {
            pushFollow(FOLLOW_qualifiable_named_element_in_behavior_enumeration_literal7610);
            qualifiable_named_element(enumeration);

            state._fsp--;
            if (state.failed) return enumeration;

            match(input,DOT,FOLLOW_DOT_in_behavior_enumeration_literal7624); if (state.failed) return enumeration;

            id1=(Token)match(input,ENUMERATOR,FOLLOW_ENUMERATOR_in_behavior_enumeration_literal7628); if (state.failed) return enumeration;

            match(input,HASH,FOLLOW_HASH_in_behavior_enumeration_literal7630); if (state.failed) return enumeration;

            id2=(Token)match(input,IDENT,FOLLOW_IDENT_in_behavior_enumeration_literal7634); if (state.failed) return enumeration;

            if ( state.backtracking==0 ) {
                   Identifier lit = _decl.createIdentifier() ;
                   lit.setId(id2.getText());
                   setLocationReference(lit, id2) ;
                   Identifier prop = _decl.createIdentifier() ;
                   prop.setId(id1.getText()) ;
                   setLocationReference(prop, id1) ;
                   
                   enumeration.setProperty(prop);
                   enumeration.setLiteral(lit);
                   // enumeration's location reference is already set, see behavior_named_element.       
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return enumeration;
    }
    // $ANTLR end "behavior_enumeration_literal"



    // $ANTLR start "numeric_literal"
    // AadlBa.g:2656:1: numeric_literal returns [NumericLiteral nl] : (realval= REAL_LIT |intLit= integer_literal ) ;
    public final NumericLiteral numeric_literal() throws RecognitionException {
        NumericLiteral nl = null;


        Token realval=null;
        BehaviorIntegerLiteral intLit =null;


         
            nl=null;
            char sign = ' '; 
          
        try {
            // AadlBa.g:2661:3: ( (realval= REAL_LIT |intLit= integer_literal ) )
            // AadlBa.g:2662:3: (realval= REAL_LIT |intLit= integer_literal )
            {
            // AadlBa.g:2662:3: (realval= REAL_LIT |intLit= integer_literal )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==REAL_LIT) ) {
                alt72=1;
            }
            else if ( (LA72_0==INTEGER_LIT) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return nl;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;

            }
            switch (alt72) {
                case 1 :
                    // AadlBa.g:2663:7: realval= REAL_LIT
                    {
                    realval=(Token)match(input,REAL_LIT,FOLLOW_REAL_LIT_in_numeric_literal7694); if (state.failed) return nl;

                    if ( state.backtracking==0 ) {
                            String str = realval.getText();
                            BehaviorRealLiteral tmp = _fact.createBehaviorRealLiteral();
                            str = str.replaceAll("_", "") ;
                            tmp.setValue(str);
                            setLocationReference(tmp, realval);
                            nl = tmp ;
                          }

                    }
                    break;
                case 2 :
                    // AadlBa.g:2673:7: intLit= integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_numeric_literal7720);
                    intLit=integer_literal();

                    state._fsp--;
                    if (state.failed) return nl;

                    if ( state.backtracking==0 ) {
                            nl = intLit ;
                          }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return nl;
    }
    // $ANTLR end "numeric_literal"



    // $ANTLR start "integer_literal"
    // AadlBa.g:2685:1: integer_literal returns [BehaviorIntegerLiteral bil] : integerval= INTEGER_LIT ;
    public final BehaviorIntegerLiteral integer_literal() throws RecognitionException {
        BehaviorIntegerLiteral bil = null;


        Token integerval=null;

        try {
            // AadlBa.g:2687:2: (integerval= INTEGER_LIT )
            // AadlBa.g:2688:5: integerval= INTEGER_LIT
            {
            integerval=(Token)match(input,INTEGER_LIT,FOLLOW_INTEGER_LIT_in_integer_literal7760); if (state.failed) return bil;

            if ( state.backtracking==0 ) {
                  try
                  {
                    String str = integerval.getText();
                    BehaviorIntegerLiteral tmp = _fact.createBehaviorIntegerLiteral();
                    tmp.setValue(str);
                    setLocationReference(tmp, integerval);
                    bil = tmp ;
                  }
                  catch (IllegalArgumentException e)
                  {
                      int line = integerval.getLine() ;
                      int col = integerval.getCharPositionInLine() ; 
                      String fileName = this.getFilename() ;
                      RecognitionException ex = new RecognitionException() ;
                      ex.line = line ;
                      ex.charPositionInLine = col ;
                      ex.input = input ;
                      throw ex ;
                  }
                }

            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return bil;
    }
    // $ANTLR end "integer_literal"



    // $ANTLR start "string_literal"
    // AadlBa.g:2719:1: string_literal returns [BehaviorStringLiteral StringLit] : (sl= STRING_LITERAL ) ;
    public final BehaviorStringLiteral string_literal() throws RecognitionException {
        BehaviorStringLiteral StringLit = null;


        Token sl=null;


           StringLit = _fact.createBehaviorStringLiteral();
         
        try {
            // AadlBa.g:2723:3: ( (sl= STRING_LITERAL ) )
            // AadlBa.g:2724:4: (sl= STRING_LITERAL )
            {
            // AadlBa.g:2724:4: (sl= STRING_LITERAL )
            // AadlBa.g:2725:6: sl= STRING_LITERAL
            {
            sl=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string_literal7806); if (state.failed) return StringLit;

            if ( state.backtracking==0 ) {
                    String str = sl.getText();
                    // stripout the quotes
                    str = str.substring(1,str.length()-1);
                    StringLit.setValue(str);
                    setLocationReference(StringLit, sl); 
                  }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return StringLit;
    }
    // $ANTLR end "string_literal"



    // $ANTLR start "numeral"
    // AadlBa.g:2743:1: numeral returns [Integer Num] : (NumVal= INTEGER_LIT ) ;
    public final Integer numeral() throws RecognitionException {
        Integer Num = null;


        Token NumVal=null;

        try {
            // AadlBa.g:2745:3: ( (NumVal= INTEGER_LIT ) )
            // AadlBa.g:2746:4: (NumVal= INTEGER_LIT )
            {
            // AadlBa.g:2746:4: (NumVal= INTEGER_LIT )
            // AadlBa.g:2747:6: NumVal= INTEGER_LIT
            {
            NumVal=(Token)match(input,INTEGER_LIT,FOLLOW_INTEGER_LIT_in_numeral7856); if (state.failed) return Num;

            if ( state.backtracking==0 ) { 
                   String tmp = NumVal.getText().replaceAll("_", "");
                   Num = Integer.parseInt(tmp) ;
                 }

            }


            }

        }
        catch (RecognitionException ex) {

              reportError(ex);
              consumeUntil(input,SEMICOLON);
              input.consume();

        }

        finally {
        	// do for sure before leaving
        }
        return Num;
    }
    // $ANTLR end "numeral"

    // $ANTLR start synpred35_AadlBa
    public final void synpred35_AadlBa_fragment() throws RecognitionException {
        BehaviorAction BehAction2 =null;


        // AadlBa.g:972:9: ( ( SEMICOLON BehAction2= behavior_action )* )
        // AadlBa.g:972:9: ( SEMICOLON BehAction2= behavior_action )*
        {
        // AadlBa.g:972:9: ( SEMICOLON BehAction2= behavior_action )*
        loop79:
        do {
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==SEMICOLON) ) {
                alt79=1;
            }


            switch (alt79) {
        	case 1 :
        	    // AadlBa.g:972:11: SEMICOLON BehAction2= behavior_action
        	    {
        	    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synpred35_AadlBa2987); if (state.failed) return ;

        	    pushFollow(FOLLOW_behavior_action_in_synpred35_AadlBa2991);
        	    BehAction2=behavior_action();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop79;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred35_AadlBa

    // $ANTLR start synpred45_AadlBa
    public final void synpred45_AadlBa_fragment() throws RecognitionException {
        IntegerRange IntRange =null;


        // AadlBa.g:1168:6: ( (IntRange= integer_range ) )
        // AadlBa.g:1168:6: (IntRange= integer_range )
        {
        // AadlBa.g:1168:6: (IntRange= integer_range )
        // AadlBa.g:1168:8: IntRange= integer_range
        {
        pushFollow(FOLLOW_integer_range_in_synpred45_AadlBa3809);
        IntRange=integer_range();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred45_AadlBa

    // $ANTLR start synpred46_AadlBa
    public final void synpred46_AadlBa_fragment() throws RecognitionException {
        AssignmentAction AssAct =null;


        // AadlBa.g:1187:6: ( (AssAct= assignment_action ) )
        // AadlBa.g:1187:6: (AssAct= assignment_action )
        {
        // AadlBa.g:1187:6: (AssAct= assignment_action )
        // AadlBa.g:1187:8: AssAct= assignment_action
        {
        pushFollow(FOLLOW_assignment_action_in_synpred46_AadlBa3873);
        AssAct=assignment_action();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred46_AadlBa

    // $ANTLR start synpred47_AadlBa
    public final void synpred47_AadlBa_fragment() throws RecognitionException {
        CommAction CommAct =null;


        // AadlBa.g:1189:6: ( (CommAct= communication_action ) )
        // AadlBa.g:1189:6: (CommAct= communication_action )
        {
        // AadlBa.g:1189:6: (CommAct= communication_action )
        // AadlBa.g:1189:8: CommAct= communication_action
        {
        pushFollow(FOLLOW_communication_action_in_synpred47_AadlBa3893);
        CommAct=communication_action();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred47_AadlBa

    // Delegated rules

    public final boolean synpred35_AadlBa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_AadlBa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_AadlBa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_AadlBa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_AadlBa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_AadlBa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_AadlBa() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_AadlBa_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_VARIABLES_in_behavior_annex1208 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_behavior_variable_list_in_behavior_annex1221 = new BitSet(new long[]{0x0000400000000002L,0x0000000000108000L});
    public static final BitSet FOLLOW_STATES_in_behavior_annex1244 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_behavior_state_list_in_behavior_annex1257 = new BitSet(new long[]{0x0000400000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_TRANSITIONS_in_behavior_annex1279 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_behavior_transition_in_behavior_annex1293 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_behavior_variable_in_behavior_variable_list1348 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_behavior_variable_list1365 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_behavior_variable_in_behavior_variable_list1369 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COLON_in_behavior_variable_list1392 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_unique_component_classifier_reference_in_behavior_variable_list1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_behavior_variable_list1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_behavior_variable1450 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_behavior_variable1460 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_integer_value_constant_in_behavior_variable1464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RBRACK_in_behavior_variable1466 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_IDENT_in_declarator1517 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_declarator1527 = new BitSet(new long[]{0x0004400000000000L});
    public static final BitSet FOLLOW_integer_value_constant_in_declarator1531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RBRACK_in_declarator1533 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_IDENT_in_qualifiable_named_element1589 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_qualifiable_named_element1591 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiable_named_element1606 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_DOT_in_qualifiable_named_element1616 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiable_named_element1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiable_named_element_in_unique_component_classifier_reference1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_behavior_state_list1721 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_behavior_state_list1737 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_state_list1741 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COLON_in_behavior_state_list1761 = new BitSet(new long[]{0x0002001000002000L,0x0000000000004000L});
    public static final BitSet FOLLOW_INITIAL_in_behavior_state_list1775 = new BitSet(new long[]{0x0000001000002000L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMPLETE_in_behavior_state_list1790 = new BitSet(new long[]{0x0000001000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_FINAL_in_behavior_state_list1804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_STATE_in_behavior_state_list1823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_behavior_state_list1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_behavior_transition1868 = new BitSet(new long[]{0x0020000000000800L});
    public static final BitSet FOLLOW_LBRACK_in_behavior_transition1886 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_numeral_in_behavior_transition1890 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RBRACK_in_behavior_transition1892 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_behavior_transition1905 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_transition1924 = new BitSet(new long[]{0x0800000000001000L});
    public static final BitSet FOLLOW_COMMA_in_behavior_transition1941 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_transition1945 = new BitSet(new long[]{0x0800000000001000L});
    public static final BitSet FOLLOW_LTRANS_in_behavior_transition1973 = new BitSet(new long[]{0x5404400800000010L,0x00000000002A024DL});
    public static final BitSet FOLLOW_behavior_condition_in_behavior_transition1977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RTRANS_in_behavior_transition1992 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_transition2009 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_behavior_action_block_in_behavior_transition2029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_behavior_transition2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURLY_in_behavior_action_block2090 = new BitSet(new long[]{0x0040C06000104000L,0x0000000001001000L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action_block2094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RCURLY_in_behavior_action_block2096 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_TIMEOUT_in_behavior_action_block2118 = new BitSet(new long[]{0x0004400800000000L,0x0000000000220040L});
    public static final BitSet FOLLOW_behavior_time_in_behavior_action_block2122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_behavior_condition2180 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_dispatch_condition_in_behavior_condition2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_execute_condition_in_behavior_condition2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMEOUT_in_execute_condition2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OTHERWISE_in_execute_condition2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_expression_in_execute_condition2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_integer_value_constant2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_integer_value_constant2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISPATCH_in_dispatch_condition2450 = new BitSet(new long[]{0x0000410000000002L,0x0000000000090000L});
    public static final BitSet FOLLOW_dispatch_trigger_condition_in_dispatch_condition2460 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_FROZEN_in_dispatch_condition2484 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_reference_in_dispatch_condition2488 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_dispatch_condition2504 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_reference_in_dispatch_condition2508 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_STOP_in_dispatch_trigger_condition2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TIMEOUT_in_dispatch_trigger_condition2639 = new BitSet(new long[]{0x0004400800000002L,0x0000000000220040L});
    public static final BitSet FOLLOW_behavior_time_in_dispatch_trigger_condition2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dispatch_trigger_logical_expression_in_dispatch_trigger_condition2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dispatch_conjunction_in_dispatch_trigger_logical_expression2780 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_dispatch_trigger_logical_expression2803 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_dispatch_conjunction_in_dispatch_trigger_logical_expression2807 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_dispatch_conjunction2866 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_dispatch_conjunction2889 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_reference_in_dispatch_conjunction2893 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_behavior_action_in_behavior_actions2961 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000400L});
    public static final BitSet FOLLOW_SEMICOLON_in_behavior_actions2987 = new BitSet(new long[]{0x0040C06000104000L,0x0000000001001000L});
    public static final BitSet FOLLOW_behavior_action_in_behavior_actions2991 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_CONCAT_in_behavior_actions3047 = new BitSet(new long[]{0x0040C06000104000L,0x0000000001001000L});
    public static final BitSet FOLLOW_behavior_action_in_behavior_actions3051 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_basic_action_in_behavior_action3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behavior_action_block_in_behavior_action3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_behavior_action3225 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3229 = new BitSet(new long[]{0x5404400800000010L,0x0000000000220048L});
    public static final BitSet FOLLOW_value_expression_in_behavior_action3233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3235 = new BitSet(new long[]{0x0040C06000104000L,0x0000000001001000L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3239 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_ELSIF_in_behavior_action3272 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3276 = new BitSet(new long[]{0x5404400800000010L,0x0000000000220048L});
    public static final BitSet FOLLOW_value_expression_in_behavior_action3280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3282 = new BitSet(new long[]{0x0040C06000104000L,0x0000000001001000L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3286 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_ELSE_in_behavior_action3329 = new BitSet(new long[]{0x0040C06000104000L,0x0000000001001000L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3333 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_END_in_behavior_action3363 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_IF_in_behavior_action3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_behavior_action3403 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3405 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_action3419 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_behavior_action3430 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_unique_component_classifier_reference_in_behavior_action3434 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IN_in_behavior_action3460 = new BitSet(new long[]{0x0004400800000000L,0x0000000000220040L});
    public static final BitSet FOLLOW_element_values_in_behavior_action3464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3466 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LCURLY_in_behavior_action3479 = new BitSet(new long[]{0x0040C06000104000L,0x0000000001001000L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RCURLY_in_behavior_action3485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORALL_in_behavior_action3524 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3526 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_action3547 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COLON_in_behavior_action3558 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_unique_component_classifier_reference_in_behavior_action3562 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_IN_in_behavior_action3589 = new BitSet(new long[]{0x0004400800000000L,0x0000000000220040L});
    public static final BitSet FOLLOW_element_values_in_behavior_action3593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3595 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LCURLY_in_behavior_action3608 = new BitSet(new long[]{0x0040C06000104000L,0x0000000001001000L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RCURLY_in_behavior_action3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_behavior_action3652 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3656 = new BitSet(new long[]{0x5404400800000010L,0x0000000000220048L});
    public static final BitSet FOLLOW_value_expression_in_behavior_action3660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3662 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_LCURLY_in_behavior_action3672 = new BitSet(new long[]{0x0040C06000104000L,0x0000000001001000L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RCURLY_in_behavior_action3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_behavior_action3717 = new BitSet(new long[]{0x0040C06000104000L,0x0000000001001000L});
    public static final BitSet FOLLOW_behavior_actions_in_behavior_action3721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_UNTIL_in_behavior_action3723 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_behavior_action3736 = new BitSet(new long[]{0x5404400800000010L,0x0000000000220048L});
    public static final BitSet FOLLOW_value_expression_in_behavior_action3740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_behavior_action3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_range_in_element_values3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_element_values3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_action_in_basic_action3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_communication_action_in_basic_action3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timed_action_in_basic_action3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_target_in_assignment_action3957 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment_action3959 = new BitSet(new long[]{0x5404400800000050L,0x0000000000220048L});
    public static final BitSet FOLLOW_value_expression_in_assignment_action3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_in_assignment_action3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_target4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_qualified_named_element4111 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_qualified_named_element4113 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualified_named_element4141 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_DOT_in_qualified_named_element4155 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualified_named_element4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_named_element_in_communication_action4311 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_EXCLAM_in_communication_action4313 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_communication_action4346 = new BitSet(new long[]{0x5404400800000010L,0x0000000000220048L});
    public static final BitSet FOLLOW_subprogram_parameter_list_in_communication_action4350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_communication_action4352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_communication_action4412 = new BitSet(new long[]{0x00080201C0000000L});
    public static final BitSet FOLLOW_INTERROG_in_communication_action4462 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_communication_action4512 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_target_in_communication_action4516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_communication_action4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GGREATER_in_communication_action4609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLLESS_in_communication_action4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLGREATER_in_communication_action4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLAM_in_communication_action4825 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_communication_action4860 = new BitSet(new long[]{0x5404400800000010L,0x0000000000220048L});
    public static final BitSet FOLLOW_subprogram_parameter_list_in_communication_action4864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_communication_action4866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_communication_action4959 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_EXCLLESS_in_communication_action4984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXCLGREATER_in_communication_action5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPUTATION_in_timed_action5108 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_timed_action5124 = new BitSet(new long[]{0x0004400800000000L,0x0000000000220040L});
    public static final BitSet FOLLOW_behavior_time_in_timed_action5133 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000100L});
    public static final BitSet FOLLOW_DOTDOT_in_timed_action5143 = new BitSet(new long[]{0x0004400800000000L,0x0000000000220040L});
    public static final BitSet FOLLOW_behavior_time_in_timed_action5147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_timed_action5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_label_in_subprogram_parameter_list5198 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMA_in_subprogram_parameter_list5209 = new BitSet(new long[]{0x5404400800000010L,0x0000000000220048L});
    public static final BitSet FOLLOW_parameter_label_in_subprogram_parameter_list5213 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_value_expression_in_parameter_label5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_identifier_in_reference5323 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_DOT_in_reference5343 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_array_identifier_in_reference5347 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_IDENT_in_array_identifier5394 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_array_identifier5414 = new BitSet(new long[]{0x0004400800000000L,0x0000000000220040L});
    public static final BitSet FOLLOW_integer_value_in_array_identifier5418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RBRACK_in_array_identifier5420 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_IDENT_in_fact_value5530 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_fact_value5532 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_fact_value5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_variable_in_fact_value5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_fact_value5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_literal_in_fact_value5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_fact_value5638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behavior_enumeration_literal_in_fact_value5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_value_in_value5720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value5744 = new BitSet(new long[]{0x5404400800000010L,0x0000000000220048L});
    public static final BitSet FOLLOW_value_expression_in_value5748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RPAREN_in_value5750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_in_value_variable5838 = new BitSet(new long[]{0x0008000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_INTERROG_in_value_variable5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TICK_in_value_variable5905 = new BitSet(new long[]{0x0000008000010000L});
    public static final BitSet FOLLOW_COUNT_in_value_variable5929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FRESH_in_value_variable5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_value_constant6119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_literal_in_value_constant6139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_literal_in_value_constant6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_behavior_enumeration_literal_in_value_constant6179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_value_constant6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_value_expression6258 = new BitSet(new long[]{0x0000000000000022L,0x0000000004000002L});
    public static final BitSet FOLLOW_logical_operator_in_value_expression6283 = new BitSet(new long[]{0x5404400800000010L,0x0000000000220048L});
    public static final BitSet FOLLOW_relation_in_value_expression6287 = new BitSet(new long[]{0x0000000000000022L,0x0000000004000002L});
    public static final BitSet FOLLOW_simple_expression_in_relation6344 = new BitSet(new long[]{0x81800C0010000002L});
    public static final BitSet FOLLOW_relational_operator_in_relation6363 = new BitSet(new long[]{0x5404400800000010L,0x0000000000220048L});
    public static final BitSet FOLLOW_simple_expression_in_relation6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_adding_operator_in_simple_expression6422 = new BitSet(new long[]{0x4404400800000010L,0x0000000000220040L});
    public static final BitSet FOLLOW_term_in_simple_expression6447 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_binary_adding_operator_in_simple_expression6470 = new BitSet(new long[]{0x4404400800000010L,0x0000000000220040L});
    public static final BitSet FOLLOW_term_in_simple_expression6474 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_factor_in_term6521 = new BitSet(new long[]{0x2000000000080002L,0x0000000000001080L});
    public static final BitSet FOLLOW_multiplying_operator_in_term6540 = new BitSet(new long[]{0x4404400800000010L,0x0000000000220040L});
    public static final BitSet FOLLOW_factor_in_term6544 = new BitSet(new long[]{0x2000000000080002L,0x0000000000001080L});
    public static final BitSet FOLLOW_value_in_factor6604 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_binary_numeric_operator_in_factor6627 = new BitSet(new long[]{0x0404400800000000L,0x0000000000220040L});
    public static final BitSet FOLLOW_value_in_factor6631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_numeric_operator_in_factor6671 = new BitSet(new long[]{0x0404400800000000L,0x0000000000220040L});
    public static final BitSet FOLLOW_value_in_factor6675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_boolean_operator_in_factor6704 = new BitSet(new long[]{0x0404400800000000L,0x0000000000220040L});
    public static final BitSet FOLLOW_value_in_factor6708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_logical_operator6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OR_in_logical_operator6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XOR_in_logical_operator6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_relational_operator6837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEQUAL_in_relational_operator6851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_relational_operator6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSOREQUAL_in_relational_operator6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHAN_in_relational_operator6893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATEROREQUAL_in_relational_operator6907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_binary_adding_operator6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_binary_adding_operator6968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_unary_adding_operator7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_unary_adding_operator7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_multiplying_operator7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIVIDE_in_multiplying_operator7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_multiplying_operator7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REM_in_multiplying_operator7114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSTAR_in_binary_numeric_operator7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABS_in_unary_numeric_operator7185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unary_boolean_operator7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_boolean_literal7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_boolean_literal7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_value_in_integer_range7333 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_DOTDOT_in_integer_range7335 = new BitSet(new long[]{0x0004400800000000L,0x0000000000220040L});
    public static final BitSet FOLLOW_integer_value_in_integer_range7339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_value_in_integer_value7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_value_in_behavior_time7462 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_time7466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_property7520 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_property7522 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_property7556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiable_named_element_in_behavior_enumeration_literal7610 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOT_in_behavior_enumeration_literal7624 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ENUMERATOR_in_behavior_enumeration_literal7628 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_HASH_in_behavior_enumeration_literal7630 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_IDENT_in_behavior_enumeration_literal7634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_LIT_in_numeric_literal7694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integer_literal_in_numeric_literal7720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LIT_in_integer_literal7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_string_literal7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_LIT_in_numeral7856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_synpred35_AadlBa2987 = new BitSet(new long[]{0x0040C06000104000L,0x0000000001001000L});
    public static final BitSet FOLLOW_behavior_action_in_synpred35_AadlBa2991 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_integer_range_in_synpred45_AadlBa3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_action_in_synpred46_AadlBa3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_communication_action_in_synpred47_AadlBa3893 = new BitSet(new long[]{0x0000000000000002L});

}