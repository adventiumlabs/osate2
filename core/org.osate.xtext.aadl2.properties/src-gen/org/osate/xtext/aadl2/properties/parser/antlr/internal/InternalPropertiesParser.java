package org.osate.xtext.aadl2.properties.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.osate.xtext.aadl2.properties.services.PropertiesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPropertiesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_28", "KEYWORD_27", "KEYWORD_26", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_19", "KEYWORD_18", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_EXPONENT", "RULE_INT_EXPONENT", "RULE_REAL_LIT", "RULE_BASED_INTEGER", "RULE_INTEGER_LIT", "RULE_EXTENDED_DIGIT", "RULE_ANNEXTEXT", "RULE_STRING", "RULE_ID", "RULE_WS"
    };
    public static final int RULE_ID=42;
    public static final int RULE_REAL_LIT=36;
    public static final int RULE_INTEGER_LIT=38;
    public static final int KEYWORD_19=13;
    public static final int KEYWORD_17=19;
    public static final int KEYWORD_18=14;
    public static final int KEYWORD_15=17;
    public static final int KEYWORD_16=18;
    public static final int KEYWORD_13=15;
    public static final int KEYWORD_14=16;
    public static final int KEYWORD_11=30;
    public static final int KEYWORD_12=31;
    public static final int EOF=-1;
    public static final int KEYWORD_10=29;
    public static final int RULE_ANNEXTEXT=40;
    public static final int KEYWORD_6=25;
    public static final int KEYWORD_7=26;
    public static final int KEYWORD_8=27;
    public static final int KEYWORD_9=28;
    public static final int KEYWORD_28=4;
    public static final int KEYWORD_24=8;
    public static final int KEYWORD_25=9;
    public static final int KEYWORD_26=6;
    public static final int KEYWORD_27=5;
    public static final int KEYWORD_20=10;
    public static final int KEYWORD_21=11;
    public static final int KEYWORD_22=12;
    public static final int KEYWORD_23=7;
    public static final int RULE_EXTENDED_DIGIT=39;
    public static final int KEYWORD_1=20;
    public static final int KEYWORD_5=24;
    public static final int KEYWORD_4=23;
    public static final int KEYWORD_3=22;
    public static final int KEYWORD_2=21;
    public static final int RULE_BASED_INTEGER=37;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_STRING=41;
    public static final int RULE_EXPONENT=34;
    public static final int RULE_INT_EXPONENT=35;
    public static final int RULE_WS=43;
    public static final int RULE_DIGIT=33;

    // delegates
    // delegators


        public InternalPropertiesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPropertiesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPropertiesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g"; }




    	private PropertiesGrammarAccess grammarAccess;
    	 	
    	public InternalPropertiesParser(TokenStream input, PropertiesGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "PModel";	
    	} 
    	   	   	
    	@Override
    	protected PropertiesGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRulePModel"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:61:1: entryRulePModel returns [EObject current=null] : iv_rulePModel= rulePModel EOF ;
    public final EObject entryRulePModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePModel = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:62:2: (iv_rulePModel= rulePModel EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:63:2: iv_rulePModel= rulePModel EOF
            {
             newCompositeNode(grammarAccess.getPModelRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePModel_in_entryRulePModel67);
            iv_rulePModel=rulePModel();

            state._fsp--;

             current =iv_rulePModel; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePModel77); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePModel"


    // $ANTLR start "rulePModel"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:70:1: rulePModel returns [EObject current=null] : this_ContainedPropertyAssociation_0= ruleContainedPropertyAssociation ;
    public final EObject rulePModel() throws RecognitionException {
        EObject current = null;

        EObject this_ContainedPropertyAssociation_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:73:28: (this_ContainedPropertyAssociation_0= ruleContainedPropertyAssociation )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:75:5: this_ContainedPropertyAssociation_0= ruleContainedPropertyAssociation
            {
             
                    newCompositeNode(grammarAccess.getPModelAccess().getContainedPropertyAssociationParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleContainedPropertyAssociation_in_rulePModel123);
            this_ContainedPropertyAssociation_0=ruleContainedPropertyAssociation();

            state._fsp--;


                    current = this_ContainedPropertyAssociation_0;
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePModel"


    // $ANTLR start "entryRuleContainedPropertyAssociation"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:91:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:92:2: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:93:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
            {
             newCompositeNode(grammarAccess.getContainedPropertyAssociationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainedPropertyAssociation_in_entryRuleContainedPropertyAssociation156);
            iv_ruleContainedPropertyAssociation=ruleContainedPropertyAssociation();

            state._fsp--;

             current =iv_ruleContainedPropertyAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContainedPropertyAssociation166); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainedPropertyAssociation"


    // $ANTLR start "ruleContainedPropertyAssociation"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:100:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= KEYWORD_15 | ( (lv_append_2_0= KEYWORD_18 ) ) ) ( (lv_constant_3_0= KEYWORD_26 ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) (otherlv_7= KEYWORD_23 otherlv_8= KEYWORD_17 ( (lv_appliesTo_9_0= ruleContainmentPath ) ) (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )* )? (otherlv_12= KEYWORD_16 otherlv_13= KEYWORD_24 otherlv_14= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_16= KEYWORD_2 )? otherlv_17= KEYWORD_8 ) ;
    public final EObject ruleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_append_2_0=null;
        Token lv_constant_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_ownedValue_4_0 = null;

        EObject lv_ownedValue_6_0 = null;

        EObject lv_appliesTo_9_0 = null;

        EObject lv_appliesTo_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:103:28: ( ( ( ( ruleQPREF ) ) (otherlv_1= KEYWORD_15 | ( (lv_append_2_0= KEYWORD_18 ) ) ) ( (lv_constant_3_0= KEYWORD_26 ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) (otherlv_7= KEYWORD_23 otherlv_8= KEYWORD_17 ( (lv_appliesTo_9_0= ruleContainmentPath ) ) (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )* )? (otherlv_12= KEYWORD_16 otherlv_13= KEYWORD_24 otherlv_14= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_16= KEYWORD_2 )? otherlv_17= KEYWORD_8 ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:104:1: ( ( ( ruleQPREF ) ) (otherlv_1= KEYWORD_15 | ( (lv_append_2_0= KEYWORD_18 ) ) ) ( (lv_constant_3_0= KEYWORD_26 ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) (otherlv_7= KEYWORD_23 otherlv_8= KEYWORD_17 ( (lv_appliesTo_9_0= ruleContainmentPath ) ) (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )* )? (otherlv_12= KEYWORD_16 otherlv_13= KEYWORD_24 otherlv_14= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_16= KEYWORD_2 )? otherlv_17= KEYWORD_8 )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:104:1: ( ( ( ruleQPREF ) ) (otherlv_1= KEYWORD_15 | ( (lv_append_2_0= KEYWORD_18 ) ) ) ( (lv_constant_3_0= KEYWORD_26 ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) (otherlv_7= KEYWORD_23 otherlv_8= KEYWORD_17 ( (lv_appliesTo_9_0= ruleContainmentPath ) ) (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )* )? (otherlv_12= KEYWORD_16 otherlv_13= KEYWORD_24 otherlv_14= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_16= KEYWORD_2 )? otherlv_17= KEYWORD_8 )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:104:2: ( ( ruleQPREF ) ) (otherlv_1= KEYWORD_15 | ( (lv_append_2_0= KEYWORD_18 ) ) ) ( (lv_constant_3_0= KEYWORD_26 ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) (otherlv_7= KEYWORD_23 otherlv_8= KEYWORD_17 ( (lv_appliesTo_9_0= ruleContainmentPath ) ) (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )* )? (otherlv_12= KEYWORD_16 otherlv_13= KEYWORD_24 otherlv_14= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_16= KEYWORD_2 )? otherlv_17= KEYWORD_8
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:104:2: ( ( ruleQPREF ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:105:1: ( ruleQPREF )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:105:1: ( ruleQPREF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:106:3: ruleQPREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQPREF_in_ruleContainedPropertyAssociation214);
            ruleQPREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:119:2: (otherlv_1= KEYWORD_15 | ( (lv_append_2_0= KEYWORD_18 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==KEYWORD_15) ) {
                alt1=1;
            }
            else if ( (LA1_0==KEYWORD_18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:120:2: otherlv_1= KEYWORD_15
                    {
                    otherlv_1=(Token)match(input,KEYWORD_15,FollowSets000.FOLLOW_KEYWORD_15_in_ruleContainedPropertyAssociation228); 

                        	newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:125:6: ( (lv_append_2_0= KEYWORD_18 ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:125:6: ( (lv_append_2_0= KEYWORD_18 ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:126:1: (lv_append_2_0= KEYWORD_18 )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:126:1: (lv_append_2_0= KEYWORD_18 )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:127:3: lv_append_2_0= KEYWORD_18
                    {
                    lv_append_2_0=(Token)match(input,KEYWORD_18,FollowSets000.FOLLOW_KEYWORD_18_in_ruleContainedPropertyAssociation252); 

                            newLeafNode(lv_append_2_0, grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                    	        }
                           		setWithLastConsumed(current, "append", true, "+=>");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:141:3: ( (lv_constant_3_0= KEYWORD_26 ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KEYWORD_26) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:142:1: (lv_constant_3_0= KEYWORD_26 )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:142:1: (lv_constant_3_0= KEYWORD_26 )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:143:3: lv_constant_3_0= KEYWORD_26
                    {
                    lv_constant_3_0=(Token)match(input,KEYWORD_26,FollowSets000.FOLLOW_KEYWORD_26_in_ruleContainedPropertyAssociation283); 

                            newLeafNode(lv_constant_3_0, grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                    	        }
                           		setWithLastConsumed(current, "constant", true, "constant");
                    	    

                    }


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:157:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:157:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:157:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:158:1: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:158:1: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:159:3: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
            {
             
            	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleOptionalModalPropertyValue_in_ruleContainedPropertyAssociation317);
            lv_ownedValue_4_0=ruleOptionalModalPropertyValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
            	        }
                   		add(
                   			current, 
                   			"ownedValue",
                    		lv_ownedValue_4_0, 
                    		"OptionalModalPropertyValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:175:2: (otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==KEYWORD_5) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:176:2: otherlv_5= KEYWORD_5 ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    {
            	    otherlv_5=(Token)match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_ruleContainedPropertyAssociation331); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
            	        
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:180:1: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:181:1: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:181:1: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:182:3: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOptionalModalPropertyValue_in_ruleContainedPropertyAssociation351);
            	    lv_ownedValue_6_0=ruleOptionalModalPropertyValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedValue",
            	            		lv_ownedValue_6_0, 
            	            		"OptionalModalPropertyValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:198:5: (otherlv_7= KEYWORD_23 otherlv_8= KEYWORD_17 ( (lv_appliesTo_9_0= ruleContainmentPath ) ) (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KEYWORD_23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:199:2: otherlv_7= KEYWORD_23 otherlv_8= KEYWORD_17 ( (lv_appliesTo_9_0= ruleContainmentPath ) ) (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )*
                    {
                    otherlv_7=(Token)match(input,KEYWORD_23,FollowSets000.FOLLOW_KEYWORD_23_in_ruleContainedPropertyAssociation368); 

                        	newLeafNode(otherlv_7, grammarAccess.getContainedPropertyAssociationAccess().getAppliesKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,KEYWORD_17,FollowSets000.FOLLOW_KEYWORD_17_in_ruleContainedPropertyAssociation380); 

                        	newLeafNode(otherlv_8, grammarAccess.getContainedPropertyAssociationAccess().getToKeyword_4_1());
                        
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:208:1: ( (lv_appliesTo_9_0= ruleContainmentPath ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:209:1: (lv_appliesTo_9_0= ruleContainmentPath )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:209:1: (lv_appliesTo_9_0= ruleContainmentPath )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:210:3: lv_appliesTo_9_0= ruleContainmentPath
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleContainmentPath_in_ruleContainedPropertyAssociation400);
                    lv_appliesTo_9_0=ruleContainmentPath();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                    	        }
                           		add(
                           			current, 
                           			"appliesTo",
                            		lv_appliesTo_9_0, 
                            		"ContainmentPath");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:226:2: (otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==KEYWORD_5) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:227:2: otherlv_10= KEYWORD_5 ( (lv_appliesTo_11_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_10=(Token)match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_ruleContainedPropertyAssociation414); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:231:1: ( (lv_appliesTo_11_0= ruleContainmentPath ) )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:232:1: (lv_appliesTo_11_0= ruleContainmentPath )
                    	    {
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:232:1: (lv_appliesTo_11_0= ruleContainmentPath )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:233:3: lv_appliesTo_11_0= ruleContainmentPath
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleContainmentPath_in_ruleContainedPropertyAssociation434);
                    	    lv_appliesTo_11_0=ruleContainmentPath();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"appliesTo",
                    	            		lv_appliesTo_11_0, 
                    	            		"ContainmentPath");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:249:6: (otherlv_12= KEYWORD_16 otherlv_13= KEYWORD_24 otherlv_14= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_16= KEYWORD_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KEYWORD_16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:250:2: otherlv_12= KEYWORD_16 otherlv_13= KEYWORD_24 otherlv_14= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_16= KEYWORD_2
                    {
                    otherlv_12=(Token)match(input,KEYWORD_16,FollowSets000.FOLLOW_KEYWORD_16_in_ruleContainedPropertyAssociation452); 

                        	newLeafNode(otherlv_12, grammarAccess.getContainedPropertyAssociationAccess().getInKeyword_5_0());
                        
                    otherlv_13=(Token)match(input,KEYWORD_24,FollowSets000.FOLLOW_KEYWORD_24_in_ruleContainedPropertyAssociation464); 

                        	newLeafNode(otherlv_13, grammarAccess.getContainedPropertyAssociationAccess().getBindingKeyword_5_1());
                        
                    otherlv_14=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleContainedPropertyAssociation476); 

                        	newLeafNode(otherlv_14, grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_2());
                        
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:264:1: ( ( ruleQCREF ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:265:1: ( ruleQCREF )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:265:1: ( ruleQCREF )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:266:3: ruleQCREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQCREF_in_ruleContainedPropertyAssociation498);
                    ruleQCREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleContainedPropertyAssociation511); 

                        	newLeafNode(otherlv_16, grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,KEYWORD_8,FollowSets000.FOLLOW_KEYWORD_8_in_ruleContainedPropertyAssociation525); 

                	newLeafNode(otherlv_17, grammarAccess.getContainedPropertyAssociationAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainedPropertyAssociation"


    // $ANTLR start "entryRuleContainmentPath"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:301:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:302:2: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:303:2: iv_ruleContainmentPath= ruleContainmentPath EOF
            {
             newCompositeNode(grammarAccess.getContainmentPathRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainmentPath_in_entryRuleContainmentPath563);
            iv_ruleContainmentPath=ruleContainmentPath();

            state._fsp--;

             current =iv_ruleContainmentPath; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContainmentPath573); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainmentPath"


    // $ANTLR start "ruleContainmentPath"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:310:1: ruleContainmentPath returns [EObject current=null] : ( () ( (lv_containmentPathElement_1_0= ruleContainmentPathElement ) ) (otherlv_2= KEYWORD_7 ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) ) )* ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_containmentPathElement_1_0 = null;

        EObject lv_containmentPathElement_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:313:28: ( ( () ( (lv_containmentPathElement_1_0= ruleContainmentPathElement ) ) (otherlv_2= KEYWORD_7 ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) ) )* ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:314:1: ( () ( (lv_containmentPathElement_1_0= ruleContainmentPathElement ) ) (otherlv_2= KEYWORD_7 ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) ) )* )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:314:1: ( () ( (lv_containmentPathElement_1_0= ruleContainmentPathElement ) ) (otherlv_2= KEYWORD_7 ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) ) )* )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:314:2: () ( (lv_containmentPathElement_1_0= ruleContainmentPathElement ) ) (otherlv_2= KEYWORD_7 ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) ) )*
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:314:2: ()
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:315:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContainmentPathAccess().getContainedNamedElementAction_0(),
                        current);
                

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:320:2: ( (lv_containmentPathElement_1_0= ruleContainmentPathElement ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:321:1: (lv_containmentPathElement_1_0= ruleContainmentPathElement )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:321:1: (lv_containmentPathElement_1_0= ruleContainmentPathElement )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:322:3: lv_containmentPathElement_1_0= ruleContainmentPathElement
            {
             
            	        newCompositeNode(grammarAccess.getContainmentPathAccess().getContainmentPathElementContainmentPathElementParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContainmentPathElement_in_ruleContainmentPath628);
            lv_containmentPathElement_1_0=ruleContainmentPathElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainmentPathRule());
            	        }
                   		add(
                   			current, 
                   			"containmentPathElement",
                    		lv_containmentPathElement_1_0, 
                    		"ContainmentPathElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:338:2: (otherlv_2= KEYWORD_7 ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==KEYWORD_7) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:339:2: otherlv_2= KEYWORD_7 ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) )
            	    {
            	    otherlv_2=(Token)match(input,KEYWORD_7,FollowSets000.FOLLOW_KEYWORD_7_in_ruleContainmentPath642); 

            	        	newLeafNode(otherlv_2, grammarAccess.getContainmentPathAccess().getFullStopKeyword_2_0());
            	        
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:343:1: ( (lv_containmentPathElement_3_0= ruleContainmentPathElement ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:344:1: (lv_containmentPathElement_3_0= ruleContainmentPathElement )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:344:1: (lv_containmentPathElement_3_0= ruleContainmentPathElement )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:345:3: lv_containmentPathElement_3_0= ruleContainmentPathElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainmentPathAccess().getContainmentPathElementContainmentPathElementParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleContainmentPathElement_in_ruleContainmentPath662);
            	    lv_containmentPathElement_3_0=ruleContainmentPathElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainmentPathRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containmentPathElement",
            	            		lv_containmentPathElement_3_0, 
            	            		"ContainmentPathElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainmentPath"


    // $ANTLR start "entryRuleOptionalModalPropertyValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:371:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:372:2: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:373:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getOptionalModalPropertyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOptionalModalPropertyValue_in_entryRuleOptionalModalPropertyValue701);
            iv_ruleOptionalModalPropertyValue=ruleOptionalModalPropertyValue();

            state._fsp--;

             current =iv_ruleOptionalModalPropertyValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOptionalModalPropertyValue711); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionalModalPropertyValue"


    // $ANTLR start "ruleOptionalModalPropertyValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:380:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= KEYWORD_16 otherlv_2= KEYWORD_22 otherlv_3= KEYWORD_1 ( (otherlv_4= RULE_ID ) ) (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )* otherlv_7= KEYWORD_2 )? ) ;
    public final EObject ruleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_ownedValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:383:28: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= KEYWORD_16 otherlv_2= KEYWORD_22 otherlv_3= KEYWORD_1 ( (otherlv_4= RULE_ID ) ) (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )* otherlv_7= KEYWORD_2 )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:384:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= KEYWORD_16 otherlv_2= KEYWORD_22 otherlv_3= KEYWORD_1 ( (otherlv_4= RULE_ID ) ) (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )* otherlv_7= KEYWORD_2 )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:384:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= KEYWORD_16 otherlv_2= KEYWORD_22 otherlv_3= KEYWORD_1 ( (otherlv_4= RULE_ID ) ) (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )* otherlv_7= KEYWORD_2 )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:384:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) (otherlv_1= KEYWORD_16 otherlv_2= KEYWORD_22 otherlv_3= KEYWORD_1 ( (otherlv_4= RULE_ID ) ) (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )* otherlv_7= KEYWORD_2 )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:384:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:385:1: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:385:1: (lv_ownedValue_0_0= rulePropertyExpression )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:386:3: lv_ownedValue_0_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePropertyExpression_in_ruleOptionalModalPropertyValue757);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalModalPropertyValueRule());
            	        }
                   		set(
                   			current, 
                   			"ownedValue",
                    		lv_ownedValue_0_0, 
                    		"PropertyExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:402:2: (otherlv_1= KEYWORD_16 otherlv_2= KEYWORD_22 otherlv_3= KEYWORD_1 ( (otherlv_4= RULE_ID ) ) (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )* otherlv_7= KEYWORD_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_16) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==KEYWORD_22) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:403:2: otherlv_1= KEYWORD_16 otherlv_2= KEYWORD_22 otherlv_3= KEYWORD_1 ( (otherlv_4= RULE_ID ) ) (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )* otherlv_7= KEYWORD_2
                    {
                    otherlv_1=(Token)match(input,KEYWORD_16,FollowSets000.FOLLOW_KEYWORD_16_in_ruleOptionalModalPropertyValue771); 

                        	newLeafNode(otherlv_1, grammarAccess.getOptionalModalPropertyValueAccess().getInKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,KEYWORD_22,FollowSets000.FOLLOW_KEYWORD_22_in_ruleOptionalModalPropertyValue783); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionalModalPropertyValueAccess().getModesKeyword_1_1());
                        
                    otherlv_3=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleOptionalModalPropertyValue795); 

                        	newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_2());
                        
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:417:1: ( (otherlv_4= RULE_ID ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:418:1: (otherlv_4= RULE_ID )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:418:1: (otherlv_4= RULE_ID )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:419:3: otherlv_4= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	        }
                            
                    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOptionalModalPropertyValue814); 

                    		newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_0()); 
                    	

                    }


                    }

                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:430:2: (otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==KEYWORD_5) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:431:2: otherlv_5= KEYWORD_5 ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_ruleOptionalModalPropertyValue828); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_4_0());
                    	        
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:435:1: ( (otherlv_6= RULE_ID ) )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:436:1: (otherlv_6= RULE_ID )
                    	    {
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:436:1: (otherlv_6= RULE_ID )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:437:3: otherlv_6= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	    	        }
                    	            
                    	    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOptionalModalPropertyValue847); 

                    	    		newLeafNode(otherlv_6, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_4_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleOptionalModalPropertyValue862); 

                        	newLeafNode(otherlv_7, grammarAccess.getOptionalModalPropertyValueAccess().getRightParenthesisKeyword_1_5());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionalModalPropertyValue"


    // $ANTLR start "entryRulePropertyValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:461:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:462:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:463:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePropertyValue_in_entryRulePropertyValue898);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyValue908); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:470:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:473:28: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:474:1: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:474:1: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:475:1: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:475:1: (lv_ownedValue_0_0= rulePropertyExpression )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:476:3: lv_ownedValue_0_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePropertyExpression_in_rulePropertyValue953);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyValueRule());
            	        }
                   		set(
                   			current, 
                   			"ownedValue",
                    		lv_ownedValue_0_0, 
                    		"PropertyExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRulePropertyExpression"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:500:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:501:2: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:502:2: iv_rulePropertyExpression= rulePropertyExpression EOF
            {
             newCompositeNode(grammarAccess.getPropertyExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePropertyExpression_in_entryRulePropertyExpression987);
            iv_rulePropertyExpression=rulePropertyExpression();

            state._fsp--;

             current =iv_rulePropertyExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyExpression997); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyExpression"


    // $ANTLR start "rulePropertyExpression"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:509:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
    public final EObject rulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RecordTerm_0 = null;

        EObject this_ReferenceTerm_1 = null;

        EObject this_ComponentClassifierTerm_2 = null;

        EObject this_ComputedTerm_3 = null;

        EObject this_StringTerm_4 = null;

        EObject this_NumericRangeTerm_5 = null;

        EObject this_RealTerm_6 = null;

        EObject this_IntegerTerm_7 = null;

        EObject this_ListTerm_8 = null;

        EObject this_BooleanLiteral_9 = null;

        EObject this_LiteralorReferenceTerm_10 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:512:28: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:513:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:513:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt10=11;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:514:5: this_RecordTerm_0= ruleRecordTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRecordTerm_in_rulePropertyExpression1044);
                    this_RecordTerm_0=ruleRecordTerm();

                    state._fsp--;


                            current = this_RecordTerm_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:524:5: this_ReferenceTerm_1= ruleReferenceTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReferenceTerm_in_rulePropertyExpression1071);
                    this_ReferenceTerm_1=ruleReferenceTerm();

                    state._fsp--;


                            current = this_ReferenceTerm_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:534:5: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComponentClassifierTerm_in_rulePropertyExpression1098);
                    this_ComponentClassifierTerm_2=ruleComponentClassifierTerm();

                    state._fsp--;


                            current = this_ComponentClassifierTerm_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:544:5: this_ComputedTerm_3= ruleComputedTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleComputedTerm_in_rulePropertyExpression1125);
                    this_ComputedTerm_3=ruleComputedTerm();

                    state._fsp--;


                            current = this_ComputedTerm_3;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:554:5: this_StringTerm_4= ruleStringTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStringTerm_in_rulePropertyExpression1152);
                    this_StringTerm_4=ruleStringTerm();

                    state._fsp--;


                            current = this_StringTerm_4;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:564:5: this_NumericRangeTerm_5= ruleNumericRangeTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleNumericRangeTerm_in_rulePropertyExpression1179);
                    this_NumericRangeTerm_5=ruleNumericRangeTerm();

                    state._fsp--;


                            current = this_NumericRangeTerm_5;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:574:5: this_RealTerm_6= ruleRealTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRealTerm_in_rulePropertyExpression1206);
                    this_RealTerm_6=ruleRealTerm();

                    state._fsp--;


                            current = this_RealTerm_6;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:584:5: this_IntegerTerm_7= ruleIntegerTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerTerm_in_rulePropertyExpression1233);
                    this_IntegerTerm_7=ruleIntegerTerm();

                    state._fsp--;


                            current = this_IntegerTerm_7;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:594:5: this_ListTerm_8= ruleListTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleListTerm_in_rulePropertyExpression1260);
                    this_ListTerm_8=ruleListTerm();

                    state._fsp--;


                            current = this_ListTerm_8;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:604:5: this_BooleanLiteral_9= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getBooleanLiteralParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_rulePropertyExpression1287);
                    this_BooleanLiteral_9=ruleBooleanLiteral();

                    state._fsp--;


                            current = this_BooleanLiteral_9;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:614:5: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralorReferenceTerm_in_rulePropertyExpression1314);
                    this_LiteralorReferenceTerm_10=ruleLiteralorReferenceTerm();

                    state._fsp--;


                            current = this_LiteralorReferenceTerm_10;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyExpression"


    // $ANTLR start "entryRuleLiteralorReferenceTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:630:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:631:2: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:632:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
            {
             newCompositeNode(grammarAccess.getLiteralorReferenceTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralorReferenceTerm_in_entryRuleLiteralorReferenceTerm1348);
            iv_ruleLiteralorReferenceTerm=ruleLiteralorReferenceTerm();

            state._fsp--;

             current =iv_ruleLiteralorReferenceTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralorReferenceTerm1358); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralorReferenceTerm"


    // $ANTLR start "ruleLiteralorReferenceTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:639:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:642:28: ( ( ( ruleQPREF ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:643:1: ( ( ruleQPREF ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:643:1: ( ( ruleQPREF ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:644:1: ( ruleQPREF )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:644:1: ( ruleQPREF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:645:3: ruleQPREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLiteralorReferenceTermRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQPREF_in_ruleLiteralorReferenceTerm1405);
            ruleQPREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralorReferenceTerm"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:666:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:667:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:668:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1439);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteral1449); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:675:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= KEYWORD_19 ) ) | otherlv_2= KEYWORD_21 ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:678:28: ( ( () ( ( (lv_value_1_0= KEYWORD_19 ) ) | otherlv_2= KEYWORD_21 ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:679:1: ( () ( ( (lv_value_1_0= KEYWORD_19 ) ) | otherlv_2= KEYWORD_21 ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:679:1: ( () ( ( (lv_value_1_0= KEYWORD_19 ) ) | otherlv_2= KEYWORD_21 ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:679:2: () ( ( (lv_value_1_0= KEYWORD_19 ) ) | otherlv_2= KEYWORD_21 )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:679:2: ()
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:680:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                        current);
                

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:685:2: ( ( (lv_value_1_0= KEYWORD_19 ) ) | otherlv_2= KEYWORD_21 )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KEYWORD_19) ) {
                alt11=1;
            }
            else if ( (LA11_0==KEYWORD_21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:685:3: ( (lv_value_1_0= KEYWORD_19 ) )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:685:3: ( (lv_value_1_0= KEYWORD_19 ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:686:1: (lv_value_1_0= KEYWORD_19 )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:686:1: (lv_value_1_0= KEYWORD_19 )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:687:3: lv_value_1_0= KEYWORD_19
                    {
                    lv_value_1_0=(Token)match(input,KEYWORD_19,FollowSets000.FOLLOW_KEYWORD_19_in_ruleBooleanLiteral1503); 

                            newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", true, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:703:2: otherlv_2= KEYWORD_21
                    {
                    otherlv_2=(Token)match(input,KEYWORD_21,FollowSets000.FOLLOW_KEYWORD_21_in_ruleBooleanLiteral1533); 

                        	newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleConstantValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:715:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:716:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:717:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             newCompositeNode(grammarAccess.getConstantValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstantValue_in_entryRuleConstantValue1568);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;

             current =iv_ruleConstantValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantValue1578); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:724:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:727:28: ( ( ( ruleQPREF ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:728:1: ( ( ruleQPREF ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:728:1: ( ( ruleQPREF ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:729:1: ( ruleQPREF )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:729:1: ( ruleQPREF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:730:3: ruleQPREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantValueRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQPREF_in_ruleConstantValue1625);
            ruleQPREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleReferenceTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:751:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:752:2: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:753:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
            {
             newCompositeNode(grammarAccess.getReferenceTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferenceTerm_in_entryRuleReferenceTerm1659);
            iv_ruleReferenceTerm=ruleReferenceTerm();

            state._fsp--;

             current =iv_ruleReferenceTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferenceTerm1669); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceTerm"


    // $ANTLR start "ruleReferenceTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:760:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= KEYWORD_27 otherlv_1= KEYWORD_1 ( ( (lv_containmentPathElement_2_0= ruleQualifiedContainmentPathElement ) ) otherlv_3= KEYWORD_7 )? ( (lv_containmentPathElement_4_0= ruleContainmentPathElement ) ) (otherlv_5= KEYWORD_7 ( (lv_containmentPathElement_6_0= ruleContainmentPathElement ) ) )* otherlv_7= KEYWORD_2 ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_containmentPathElement_2_0 = null;

        EObject lv_containmentPathElement_4_0 = null;

        EObject lv_containmentPathElement_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:763:28: ( (otherlv_0= KEYWORD_27 otherlv_1= KEYWORD_1 ( ( (lv_containmentPathElement_2_0= ruleQualifiedContainmentPathElement ) ) otherlv_3= KEYWORD_7 )? ( (lv_containmentPathElement_4_0= ruleContainmentPathElement ) ) (otherlv_5= KEYWORD_7 ( (lv_containmentPathElement_6_0= ruleContainmentPathElement ) ) )* otherlv_7= KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:764:1: (otherlv_0= KEYWORD_27 otherlv_1= KEYWORD_1 ( ( (lv_containmentPathElement_2_0= ruleQualifiedContainmentPathElement ) ) otherlv_3= KEYWORD_7 )? ( (lv_containmentPathElement_4_0= ruleContainmentPathElement ) ) (otherlv_5= KEYWORD_7 ( (lv_containmentPathElement_6_0= ruleContainmentPathElement ) ) )* otherlv_7= KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:764:1: (otherlv_0= KEYWORD_27 otherlv_1= KEYWORD_1 ( ( (lv_containmentPathElement_2_0= ruleQualifiedContainmentPathElement ) ) otherlv_3= KEYWORD_7 )? ( (lv_containmentPathElement_4_0= ruleContainmentPathElement ) ) (otherlv_5= KEYWORD_7 ( (lv_containmentPathElement_6_0= ruleContainmentPathElement ) ) )* otherlv_7= KEYWORD_2 )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:765:2: otherlv_0= KEYWORD_27 otherlv_1= KEYWORD_1 ( ( (lv_containmentPathElement_2_0= ruleQualifiedContainmentPathElement ) ) otherlv_3= KEYWORD_7 )? ( (lv_containmentPathElement_4_0= ruleContainmentPathElement ) ) (otherlv_5= KEYWORD_7 ( (lv_containmentPathElement_6_0= ruleContainmentPathElement ) ) )* otherlv_7= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_27,FollowSets000.FOLLOW_KEYWORD_27_in_ruleReferenceTerm1707); 

                	newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
                
            otherlv_1=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleReferenceTerm1719); 

                	newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
                
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:774:1: ( ( (lv_containmentPathElement_2_0= ruleQualifiedContainmentPathElement ) ) otherlv_3= KEYWORD_7 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==KEYWORD_14) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:774:2: ( (lv_containmentPathElement_2_0= ruleQualifiedContainmentPathElement ) ) otherlv_3= KEYWORD_7
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:774:2: ( (lv_containmentPathElement_2_0= ruleQualifiedContainmentPathElement ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:775:1: (lv_containmentPathElement_2_0= ruleQualifiedContainmentPathElement )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:775:1: (lv_containmentPathElement_2_0= ruleQualifiedContainmentPathElement )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:776:3: lv_containmentPathElement_2_0= ruleQualifiedContainmentPathElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceTermAccess().getContainmentPathElementQualifiedContainmentPathElementParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedContainmentPathElement_in_ruleReferenceTerm1740);
                    lv_containmentPathElement_2_0=ruleQualifiedContainmentPathElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReferenceTermRule());
                    	        }
                           		add(
                           			current, 
                           			"containmentPathElement",
                            		lv_containmentPathElement_2_0, 
                            		"QualifiedContainmentPathElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,KEYWORD_7,FollowSets000.FOLLOW_KEYWORD_7_in_ruleReferenceTerm1753); 

                        	newLeafNode(otherlv_3, grammarAccess.getReferenceTermAccess().getFullStopKeyword_2_1());
                        

                    }
                    break;

            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:797:3: ( (lv_containmentPathElement_4_0= ruleContainmentPathElement ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:798:1: (lv_containmentPathElement_4_0= ruleContainmentPathElement )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:798:1: (lv_containmentPathElement_4_0= ruleContainmentPathElement )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:799:3: lv_containmentPathElement_4_0= ruleContainmentPathElement
            {
             
            	        newCompositeNode(grammarAccess.getReferenceTermAccess().getContainmentPathElementContainmentPathElementParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContainmentPathElement_in_ruleReferenceTerm1775);
            lv_containmentPathElement_4_0=ruleContainmentPathElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReferenceTermRule());
            	        }
                   		add(
                   			current, 
                   			"containmentPathElement",
                    		lv_containmentPathElement_4_0, 
                    		"ContainmentPathElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:815:2: (otherlv_5= KEYWORD_7 ( (lv_containmentPathElement_6_0= ruleContainmentPathElement ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==KEYWORD_7) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:816:2: otherlv_5= KEYWORD_7 ( (lv_containmentPathElement_6_0= ruleContainmentPathElement ) )
            	    {
            	    otherlv_5=(Token)match(input,KEYWORD_7,FollowSets000.FOLLOW_KEYWORD_7_in_ruleReferenceTerm1789); 

            	        	newLeafNode(otherlv_5, grammarAccess.getReferenceTermAccess().getFullStopKeyword_4_0());
            	        
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:820:1: ( (lv_containmentPathElement_6_0= ruleContainmentPathElement ) )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:821:1: (lv_containmentPathElement_6_0= ruleContainmentPathElement )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:821:1: (lv_containmentPathElement_6_0= ruleContainmentPathElement )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:822:3: lv_containmentPathElement_6_0= ruleContainmentPathElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getReferenceTermAccess().getContainmentPathElementContainmentPathElementParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleContainmentPathElement_in_ruleReferenceTerm1809);
            	    lv_containmentPathElement_6_0=ruleContainmentPathElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getReferenceTermRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containmentPathElement",
            	            		lv_containmentPathElement_6_0, 
            	            		"ContainmentPathElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_7=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleReferenceTerm1824); 

                	newLeafNode(otherlv_7, grammarAccess.getReferenceTermAccess().getRightParenthesisKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceTerm"


    // $ANTLR start "entryRuleRecordTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:851:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:852:2: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:853:2: iv_ruleRecordTerm= ruleRecordTerm EOF
            {
             newCompositeNode(grammarAccess.getRecordTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm1858);
            iv_ruleRecordTerm=ruleRecordTerm();

            state._fsp--;

             current =iv_ruleRecordTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecordTerm1868); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordTerm"


    // $ANTLR start "ruleRecordTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:860:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= KEYWORD_9 ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= KEYWORD_10 ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:863:28: ( (otherlv_0= KEYWORD_9 ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= KEYWORD_10 ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:864:1: (otherlv_0= KEYWORD_9 ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= KEYWORD_10 )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:864:1: (otherlv_0= KEYWORD_9 ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= KEYWORD_10 )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:865:2: otherlv_0= KEYWORD_9 ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= KEYWORD_10
            {
            otherlv_0=(Token)match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_ruleRecordTerm1906); 

                	newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
                
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:869:1: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:870:1: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:870:1: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:871:3: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleFieldPropertyAssociation_in_ruleRecordTerm1926);
            	    lv_ownedFieldValue_1_0=ruleFieldPropertyAssociation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRecordTermRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedFieldValue",
            	            		lv_ownedFieldValue_1_0, 
            	            		"FieldPropertyAssociation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_2=(Token)match(input,KEYWORD_10,FollowSets000.FOLLOW_KEYWORD_10_in_ruleRecordTerm1940); 

                	newLeafNode(otherlv_2, grammarAccess.getRecordTermAccess().getRightSquareBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordTerm"


    // $ANTLR start "entryRuleComputedTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:902:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:903:2: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:904:2: iv_ruleComputedTerm= ruleComputedTerm EOF
            {
             newCompositeNode(grammarAccess.getComputedTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComputedTerm_in_entryRuleComputedTerm1976);
            iv_ruleComputedTerm=ruleComputedTerm();

            state._fsp--;

             current =iv_ruleComputedTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComputedTerm1986); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComputedTerm"


    // $ANTLR start "ruleComputedTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:911:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_function_2_0= RULE_ID ) ) otherlv_3= KEYWORD_2 ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:914:28: ( (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_function_2_0= RULE_ID ) ) otherlv_3= KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:915:1: (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_function_2_0= RULE_ID ) ) otherlv_3= KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:915:1: (otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_function_2_0= RULE_ID ) ) otherlv_3= KEYWORD_2 )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:916:2: otherlv_0= KEYWORD_25 otherlv_1= KEYWORD_1 ( (lv_function_2_0= RULE_ID ) ) otherlv_3= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_25,FollowSets000.FOLLOW_KEYWORD_25_in_ruleComputedTerm2024); 

                	newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
                
            otherlv_1=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleComputedTerm2036); 

                	newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
                
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:925:1: ( (lv_function_2_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:926:1: (lv_function_2_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:926:1: (lv_function_2_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:927:3: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleComputedTerm2052); 

            			newLeafNode(lv_function_2_0, grammarAccess.getComputedTermAccess().getFunctionIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComputedTermRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"function",
                    		lv_function_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleComputedTerm2070); 

                	newLeafNode(otherlv_3, grammarAccess.getComputedTermAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComputedTerm"


    // $ANTLR start "entryRuleComponentClassifierTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:956:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:957:2: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:958:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
            {
             newCompositeNode(grammarAccess.getComponentClassifierTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComponentClassifierTerm_in_entryRuleComponentClassifierTerm2104);
            iv_ruleComponentClassifierTerm=ruleComponentClassifierTerm();

            state._fsp--;

             current =iv_ruleComponentClassifierTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComponentClassifierTerm2114); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentClassifierTerm"


    // $ANTLR start "ruleComponentClassifierTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:965:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_3= KEYWORD_2 ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:968:28: ( (otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_3= KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:969:1: (otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_3= KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:969:1: (otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_3= KEYWORD_2 )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:970:2: otherlv_0= KEYWORD_28 otherlv_1= KEYWORD_1 ( ( ruleQCREF ) ) otherlv_3= KEYWORD_2
            {
            otherlv_0=(Token)match(input,KEYWORD_28,FollowSets000.FOLLOW_KEYWORD_28_in_ruleComponentClassifierTerm2152); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
                
            otherlv_1=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleComponentClassifierTerm2164); 

                	newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
                
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:979:1: ( ( ruleQCREF ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:980:1: ( ruleQCREF )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:980:1: ( ruleQCREF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:981:3: ruleQCREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentClassifierTermRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQCREF_in_ruleComponentClassifierTerm2186);
            ruleQCREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleComponentClassifierTerm2199); 

                	newLeafNode(otherlv_3, grammarAccess.getComponentClassifierTermAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentClassifierTerm"


    // $ANTLR start "entryRuleListTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1007:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1008:2: (iv_ruleListTerm= ruleListTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1009:2: iv_ruleListTerm= ruleListTerm EOF
            {
             newCompositeNode(grammarAccess.getListTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleListTerm_in_entryRuleListTerm2233);
            iv_ruleListTerm=ruleListTerm();

            state._fsp--;

             current =iv_ruleListTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleListTerm2243); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListTerm"


    // $ANTLR start "ruleListTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1016:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= KEYWORD_1 ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= KEYWORD_2 ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedListElement_2_0 = null;

        EObject lv_ownedListElement_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1019:28: ( ( () otherlv_1= KEYWORD_1 ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= KEYWORD_2 ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1020:1: ( () otherlv_1= KEYWORD_1 ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= KEYWORD_2 )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1020:1: ( () otherlv_1= KEYWORD_1 ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= KEYWORD_2 )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1020:2: () otherlv_1= KEYWORD_1 ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= KEYWORD_2
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1020:2: ()
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1021:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListTermAccess().getListValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,KEYWORD_1,FollowSets000.FOLLOW_KEYWORD_1_in_ruleListTerm2290); 

                	newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
                
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1031:1: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=KEYWORD_28 && LA16_0<=KEYWORD_27)||LA16_0==KEYWORD_25||LA16_0==KEYWORD_21||LA16_0==KEYWORD_19||LA16_0==KEYWORD_1||LA16_0==KEYWORD_4||LA16_0==KEYWORD_6||LA16_0==KEYWORD_9||LA16_0==RULE_REAL_LIT||LA16_0==RULE_INTEGER_LIT||(LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1031:2: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1031:2: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1032:1: (lv_ownedListElement_2_0= rulePropertyExpression )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1032:1: (lv_ownedListElement_2_0= rulePropertyExpression )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1033:3: lv_ownedListElement_2_0= rulePropertyExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePropertyExpression_in_ruleListTerm2311);
                    lv_ownedListElement_2_0=rulePropertyExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListTermRule());
                    	        }
                           		add(
                           			current, 
                           			"ownedListElement",
                            		lv_ownedListElement_2_0, 
                            		"PropertyExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1049:2: (otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==KEYWORD_5) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1050:2: otherlv_3= KEYWORD_5 ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,KEYWORD_5,FollowSets000.FOLLOW_KEYWORD_5_in_ruleListTerm2325); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1054:1: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1055:1: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    {
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1055:1: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1056:3: lv_ownedListElement_4_0= rulePropertyExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_rulePropertyExpression_in_ruleListTerm2345);
                    	    lv_ownedListElement_4_0=rulePropertyExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getListTermRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ownedListElement",
                    	            		lv_ownedListElement_4_0, 
                    	            		"PropertyExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,KEYWORD_2,FollowSets000.FOLLOW_KEYWORD_2_in_ruleListTerm2362); 

                	newLeafNode(otherlv_5, grammarAccess.getListTermAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListTerm"


    // $ANTLR start "entryRuleFieldPropertyAssociation"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1085:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1086:2: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1087:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
            {
             newCompositeNode(grammarAccess.getFieldPropertyAssociationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFieldPropertyAssociation_in_entryRuleFieldPropertyAssociation2396);
            iv_ruleFieldPropertyAssociation=ruleFieldPropertyAssociation();

            state._fsp--;

             current =iv_ruleFieldPropertyAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldPropertyAssociation2406); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldPropertyAssociation"


    // $ANTLR start "ruleFieldPropertyAssociation"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1094:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_15 ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= KEYWORD_8 ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1097:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_15 ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= KEYWORD_8 ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1098:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_15 ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= KEYWORD_8 )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1098:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_15 ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= KEYWORD_8 )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1098:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= KEYWORD_15 ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= KEYWORD_8
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1098:2: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1099:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1099:1: (otherlv_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1100:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFieldPropertyAssociation2451); 

            		newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_15,FollowSets000.FOLLOW_KEYWORD_15_in_ruleFieldPropertyAssociation2464); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1116:1: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1117:1: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1117:1: (lv_ownedValue_2_0= rulePropertyExpression )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1118:3: lv_ownedValue_2_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePropertyExpression_in_ruleFieldPropertyAssociation2484);
            lv_ownedValue_2_0=rulePropertyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldPropertyAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"ownedValue",
                    		lv_ownedValue_2_0, 
                    		"PropertyExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,KEYWORD_8,FollowSets000.FOLLOW_KEYWORD_8_in_ruleFieldPropertyAssociation2497); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldPropertyAssociationAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldPropertyAssociation"


    // $ANTLR start "entryRuleContainmentPathElement"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1147:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1148:2: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1149:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
            {
             newCompositeNode(grammarAccess.getContainmentPathElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainmentPathElement_in_entryRuleContainmentPathElement2531);
            iv_ruleContainmentPathElement=ruleContainmentPathElement();

            state._fsp--;

             current =iv_ruleContainmentPathElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContainmentPathElement2541); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainmentPathElement"


    // $ANTLR start "ruleContainmentPathElement"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1156:1: ruleContainmentPathElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_arrayRange_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1159:28: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1160:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1160:1: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1160:2: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1160:2: ( (otherlv_0= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1161:1: (otherlv_0= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1161:1: (otherlv_0= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1162:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainmentPathElementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleContainmentPathElement2586); 

            		newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0()); 
            	

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1173:2: ( (lv_arrayRange_1_0= ruleArrayRange ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_9) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1174:1: (lv_arrayRange_1_0= ruleArrayRange )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1174:1: (lv_arrayRange_1_0= ruleArrayRange )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1175:3: lv_arrayRange_1_0= ruleArrayRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleArrayRange_in_ruleContainmentPathElement2607);
                    lv_arrayRange_1_0=ruleArrayRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
                    	        }
                           		add(
                           			current, 
                           			"arrayRange",
                            		lv_arrayRange_1_0, 
                            		"ArrayRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainmentPathElement"


    // $ANTLR start "entryRuleQualifiedContainmentPathElement"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1199:1: entryRuleQualifiedContainmentPathElement returns [EObject current=null] : iv_ruleQualifiedContainmentPathElement= ruleQualifiedContainmentPathElement EOF ;
    public final EObject entryRuleQualifiedContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedContainmentPathElement = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1200:2: (iv_ruleQualifiedContainmentPathElement= ruleQualifiedContainmentPathElement EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1201:2: iv_ruleQualifiedContainmentPathElement= ruleQualifiedContainmentPathElement EOF
            {
             newCompositeNode(grammarAccess.getQualifiedContainmentPathElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedContainmentPathElement_in_entryRuleQualifiedContainmentPathElement2643);
            iv_ruleQualifiedContainmentPathElement=ruleQualifiedContainmentPathElement();

            state._fsp--;

             current =iv_ruleQualifiedContainmentPathElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedContainmentPathElement2653); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedContainmentPathElement"


    // $ANTLR start "ruleQualifiedContainmentPathElement"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1208:1: ruleQualifiedContainmentPathElement returns [EObject current=null] : ( ( ruleQCLREF ) ) ;
    public final EObject ruleQualifiedContainmentPathElement() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1211:28: ( ( ( ruleQCLREF ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1212:1: ( ( ruleQCLREF ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1212:1: ( ( ruleQCLREF ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1213:1: ( ruleQCLREF )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1213:1: ( ruleQCLREF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1214:3: ruleQCLREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getQualifiedContainmentPathElementRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getQualifiedContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleQCLREF_in_ruleQualifiedContainmentPathElement2700);
            ruleQCLREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedContainmentPathElement"


    // $ANTLR start "entryRulePlusMinus"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1237:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1238:1: (iv_rulePlusMinus= rulePlusMinus EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1239:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePlusMinus_in_entryRulePlusMinus2737);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;

             current =iv_rulePlusMinus.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePlusMinus2748); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1246:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_4 | kw= KEYWORD_6 ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1250:6: ( (kw= KEYWORD_4 | kw= KEYWORD_6 ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1251:1: (kw= KEYWORD_4 | kw= KEYWORD_6 )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1251:1: (kw= KEYWORD_4 | kw= KEYWORD_6 )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KEYWORD_4) ) {
                alt18=1;
            }
            else if ( (LA18_0==KEYWORD_6) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1252:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FollowSets000.FOLLOW_KEYWORD_4_in_rulePlusMinus2786); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1259:2: kw= KEYWORD_6
                    {
                    kw=(Token)match(input,KEYWORD_6,FollowSets000.FOLLOW_KEYWORD_6_in_rulePlusMinus2805); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleStringTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1272:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1273:2: (iv_ruleStringTerm= ruleStringTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1274:2: iv_ruleStringTerm= ruleStringTerm EOF
            {
             newCompositeNode(grammarAccess.getStringTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStringTerm_in_entryRuleStringTerm2844);
            iv_ruleStringTerm=ruleStringTerm();

            state._fsp--;

             current =iv_ruleStringTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStringTerm2854); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringTerm"


    // $ANTLR start "ruleStringTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1281:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1284:28: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1285:1: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1285:1: ( (lv_value_0_0= ruleNoQuoteString ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1286:1: (lv_value_0_0= ruleNoQuoteString )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1286:1: (lv_value_0_0= ruleNoQuoteString )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1287:3: lv_value_0_0= ruleNoQuoteString
            {
             
            	        newCompositeNode(grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNoQuoteString_in_ruleStringTerm2899);
            lv_value_0_0=ruleNoQuoteString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringTermRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"NoQuoteString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringTerm"


    // $ANTLR start "entryRuleNoQuoteString"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1311:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1312:1: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1313:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
            {
             newCompositeNode(grammarAccess.getNoQuoteStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNoQuoteString_in_entryRuleNoQuoteString2934);
            iv_ruleNoQuoteString=ruleNoQuoteString();

            state._fsp--;

             current =iv_ruleNoQuoteString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNoQuoteString2945); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoQuoteString"


    // $ANTLR start "ruleNoQuoteString"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1320:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1324:6: (this_STRING_0= RULE_STRING )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1325:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleNoQuoteString2984); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoQuoteString"


    // $ANTLR start "entryRuleArrayRange"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1340:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1341:2: (iv_ruleArrayRange= ruleArrayRange EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1342:2: iv_ruleArrayRange= ruleArrayRange EOF
            {
             newCompositeNode(grammarAccess.getArrayRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleArrayRange_in_entryRuleArrayRange3027);
            iv_ruleArrayRange=ruleArrayRange();

            state._fsp--;

             current =iv_ruleArrayRange; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayRange3037); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayRange"


    // $ANTLR start "ruleArrayRange"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1349:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= KEYWORD_9 ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= KEYWORD_13 ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= KEYWORD_10 ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1352:28: ( ( () otherlv_1= KEYWORD_9 ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= KEYWORD_13 ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= KEYWORD_10 ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1353:1: ( () otherlv_1= KEYWORD_9 ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= KEYWORD_13 ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= KEYWORD_10 )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1353:1: ( () otherlv_1= KEYWORD_9 ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= KEYWORD_13 ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= KEYWORD_10 )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1353:2: () otherlv_1= KEYWORD_9 ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= KEYWORD_13 ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= KEYWORD_10
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1353:2: ()
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1354:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,KEYWORD_9,FollowSets000.FOLLOW_KEYWORD_9_in_ruleArrayRange3084); 

                	newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
                
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1364:1: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1365:1: (lv_lowerBound_2_0= ruleINTVALUE )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1365:1: (lv_lowerBound_2_0= ruleINTVALUE )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1366:3: lv_lowerBound_2_0= ruleINTVALUE
            {
             
            	        newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleINTVALUE_in_ruleArrayRange3104);
            lv_lowerBound_2_0=ruleINTVALUE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArrayRangeRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_2_0, 
                    		"INTVALUE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1382:2: (otherlv_3= KEYWORD_13 ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KEYWORD_13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1383:2: otherlv_3= KEYWORD_13 ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_13,FollowSets000.FOLLOW_KEYWORD_13_in_ruleArrayRange3118); 

                        	newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                        
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1387:1: ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1388:1: (lv_upperBound_4_0= ruleINTVALUE )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1388:1: (lv_upperBound_4_0= ruleINTVALUE )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1389:3: lv_upperBound_4_0= ruleINTVALUE
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleINTVALUE_in_ruleArrayRange3138);
                    lv_upperBound_4_0=ruleINTVALUE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayRangeRule());
                    	        }
                           		set(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_4_0, 
                            		"INTVALUE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,KEYWORD_10,FollowSets000.FOLLOW_KEYWORD_10_in_ruleArrayRange3153); 

                	newLeafNode(otherlv_5, grammarAccess.getArrayRangeAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayRange"


    // $ANTLR start "entryRuleSignedConstant"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1418:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1419:2: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1420:2: iv_ruleSignedConstant= ruleSignedConstant EOF
            {
             newCompositeNode(grammarAccess.getSignedConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignedConstant_in_entryRuleSignedConstant3187);
            iv_ruleSignedConstant=ruleSignedConstant();

            state._fsp--;

             current =iv_ruleSignedConstant; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignedConstant3197); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedConstant"


    // $ANTLR start "ruleSignedConstant"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1427:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1430:28: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1431:1: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1431:1: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1431:2: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1431:2: ( (lv_op_0_0= rulePlusMinus ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1432:1: (lv_op_0_0= rulePlusMinus )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1432:1: (lv_op_0_0= rulePlusMinus )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1433:3: lv_op_0_0= rulePlusMinus
            {
             
            	        newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_rulePlusMinus_in_ruleSignedConstant3243);
            lv_op_0_0=rulePlusMinus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignedConstantRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_0_0, 
                    		"PlusMinus");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1449:2: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1450:1: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1450:1: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1451:3: lv_ownedPropertyExpression_1_0= ruleConstantValue
            {
             
            	        newCompositeNode(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionConstantValueParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConstantValue_in_ruleSignedConstant3264);
            lv_ownedPropertyExpression_1_0=ruleConstantValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignedConstantRule());
            	        }
                   		add(
                   			current, 
                   			"ownedPropertyExpression",
                    		lv_ownedPropertyExpression_1_0, 
                    		"ConstantValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedConstant"


    // $ANTLR start "entryRuleIntegerTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1475:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1476:2: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1477:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
            {
             newCompositeNode(grammarAccess.getIntegerTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIntegerTerm_in_entryRuleIntegerTerm3299);
            iv_ruleIntegerTerm=ruleIntegerTerm();

            state._fsp--;

             current =iv_ruleIntegerTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerTerm3309); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerTerm"


    // $ANTLR start "ruleIntegerTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1484:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1487:28: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1488:1: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1488:1: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1488:2: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1488:2: ( (lv_value_0_0= ruleSignedInt ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1489:1: (lv_value_0_0= ruleSignedInt )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1489:1: (lv_value_0_0= ruleSignedInt )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1490:3: lv_value_0_0= ruleSignedInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSignedInt_in_ruleIntegerTerm3355);
            lv_value_0_0=ruleSignedInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerTermRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"SignedInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1506:2: ( (otherlv_1= RULE_ID ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1507:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1507:1: (otherlv_1= RULE_ID )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1508:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerTermRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleIntegerTerm3375); 

                    		newLeafNode(otherlv_1, grammarAccess.getIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
                    	

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerTerm"


    // $ANTLR start "entryRuleSignedInt"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1527:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1528:1: (iv_ruleSignedInt= ruleSignedInt EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1529:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
             newCompositeNode(grammarAccess.getSignedIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignedInt_in_entryRuleSignedInt3412);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;

             current =iv_ruleSignedInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignedInt3423); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1536:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTEGER_LIT_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1540:6: ( ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1541:1: ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1541:1: ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1541:2: (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1541:2: (kw= KEYWORD_4 | kw= KEYWORD_6 )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KEYWORD_4) ) {
                alt21=1;
            }
            else if ( (LA21_0==KEYWORD_6) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1542:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FollowSets000.FOLLOW_KEYWORD_4_in_ruleSignedInt3462); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1549:2: kw= KEYWORD_6
                    {
                    kw=(Token)match(input,KEYWORD_6,FollowSets000.FOLLOW_KEYWORD_6_in_ruleSignedInt3481); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INTEGER_LIT_2=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_RULE_INTEGER_LIT_in_ruleSignedInt3498); 

            		current.merge(this_INTEGER_LIT_2);
                
             
                newLeafNode(this_INTEGER_LIT_2, grammarAccess.getSignedIntAccess().getINTEGER_LITTerminalRuleCall_1()); 
                

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "entryRuleRealTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1569:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1570:2: (iv_ruleRealTerm= ruleRealTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1571:2: iv_ruleRealTerm= ruleRealTerm EOF
            {
             newCompositeNode(grammarAccess.getRealTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRealTerm_in_entryRuleRealTerm3542);
            iv_ruleRealTerm=ruleRealTerm();

            state._fsp--;

             current =iv_ruleRealTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRealTerm3552); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealTerm"


    // $ANTLR start "ruleRealTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1578:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1581:28: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1582:1: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1582:1: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1582:2: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1582:2: ( (lv_value_0_0= ruleSignedReal ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1583:1: (lv_value_0_0= ruleSignedReal )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1583:1: (lv_value_0_0= ruleSignedReal )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1584:3: lv_value_0_0= ruleSignedReal
            {
             
            	        newCompositeNode(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSignedReal_in_ruleRealTerm3598);
            lv_value_0_0=ruleSignedReal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRealTermRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"SignedReal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1600:2: ( (otherlv_1= RULE_ID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1601:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1601:1: (otherlv_1= RULE_ID )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1602:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRealTermRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRealTerm3618); 

                    		newLeafNode(otherlv_1, grammarAccess.getRealTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
                    	

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealTerm"


    // $ANTLR start "entryRuleSignedReal"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1621:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1622:1: (iv_ruleSignedReal= ruleSignedReal EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1623:2: iv_ruleSignedReal= ruleSignedReal EOF
            {
             newCompositeNode(grammarAccess.getSignedRealRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSignedReal_in_entryRuleSignedReal3655);
            iv_ruleSignedReal=ruleSignedReal();

            state._fsp--;

             current =iv_ruleSignedReal.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignedReal3666); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedReal"


    // $ANTLR start "ruleSignedReal"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1630:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_REAL_LIT_2= RULE_REAL_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_LIT_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1634:6: ( ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_REAL_LIT_2= RULE_REAL_LIT ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1635:1: ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_REAL_LIT_2= RULE_REAL_LIT )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1635:1: ( (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_REAL_LIT_2= RULE_REAL_LIT )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1635:2: (kw= KEYWORD_4 | kw= KEYWORD_6 )? this_REAL_LIT_2= RULE_REAL_LIT
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1635:2: (kw= KEYWORD_4 | kw= KEYWORD_6 )?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KEYWORD_4) ) {
                alt23=1;
            }
            else if ( (LA23_0==KEYWORD_6) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1636:2: kw= KEYWORD_4
                    {
                    kw=(Token)match(input,KEYWORD_4,FollowSets000.FOLLOW_KEYWORD_4_in_ruleSignedReal3705); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1643:2: kw= KEYWORD_6
                    {
                    kw=(Token)match(input,KEYWORD_6,FollowSets000.FOLLOW_KEYWORD_6_in_ruleSignedReal3724); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_REAL_LIT_2=(Token)match(input,RULE_REAL_LIT,FollowSets000.FOLLOW_RULE_REAL_LIT_in_ruleSignedReal3741); 

            		current.merge(this_REAL_LIT_2);
                
             
                newLeafNode(this_REAL_LIT_2, grammarAccess.getSignedRealAccess().getREAL_LITTerminalRuleCall_1()); 
                

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedReal"


    // $ANTLR start "entryRuleNumericRangeTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1663:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1664:2: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1665:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
            {
             newCompositeNode(grammarAccess.getNumericRangeTermRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumericRangeTerm_in_entryRuleNumericRangeTerm3785);
            iv_ruleNumericRangeTerm=ruleNumericRangeTerm();

            state._fsp--;

             current =iv_ruleNumericRangeTerm; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumericRangeTerm3795); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericRangeTerm"


    // $ANTLR start "ruleNumericRangeTerm"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1672:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= KEYWORD_13 ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= KEYWORD_20 ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_delta_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1675:28: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= KEYWORD_13 ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= KEYWORD_20 ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1676:1: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= KEYWORD_13 ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= KEYWORD_20 ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1676:1: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= KEYWORD_13 ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= KEYWORD_20 ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1676:2: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= KEYWORD_13 ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= KEYWORD_20 ( (lv_delta_4_0= ruleNumAlt ) ) )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1676:2: ( (lv_minimum_0_0= ruleNumAlt ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1677:1: (lv_minimum_0_0= ruleNumAlt )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1677:1: (lv_minimum_0_0= ruleNumAlt )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1678:3: lv_minimum_0_0= ruleNumAlt
            {
             
            	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNumAlt_in_ruleNumericRangeTerm3841);
            lv_minimum_0_0=ruleNumAlt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
            	        }
                   		set(
                   			current, 
                   			"minimum",
                    		lv_minimum_0_0, 
                    		"NumAlt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,KEYWORD_13,FollowSets000.FOLLOW_KEYWORD_13_in_ruleNumericRangeTerm3854); 

                	newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
                
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1699:1: ( (lv_maximum_2_0= ruleNumAlt ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1700:1: (lv_maximum_2_0= ruleNumAlt )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1700:1: (lv_maximum_2_0= ruleNumAlt )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1701:3: lv_maximum_2_0= ruleNumAlt
            {
             
            	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleNumAlt_in_ruleNumericRangeTerm3874);
            lv_maximum_2_0=ruleNumAlt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
            	        }
                   		set(
                   			current, 
                   			"maximum",
                    		lv_maximum_2_0, 
                    		"NumAlt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1717:2: (otherlv_3= KEYWORD_20 ( (lv_delta_4_0= ruleNumAlt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==KEYWORD_20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1718:2: otherlv_3= KEYWORD_20 ( (lv_delta_4_0= ruleNumAlt ) )
                    {
                    otherlv_3=(Token)match(input,KEYWORD_20,FollowSets000.FOLLOW_KEYWORD_20_in_ruleNumericRangeTerm3888); 

                        	newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                        
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1722:1: ( (lv_delta_4_0= ruleNumAlt ) )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1723:1: (lv_delta_4_0= ruleNumAlt )
                    {
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1723:1: (lv_delta_4_0= ruleNumAlt )
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1724:3: lv_delta_4_0= ruleNumAlt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getDeltaNumAltParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleNumAlt_in_ruleNumericRangeTerm3908);
                    lv_delta_4_0=ruleNumAlt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                    	        }
                           		set(
                           			current, 
                           			"delta",
                            		lv_delta_4_0, 
                            		"NumAlt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericRangeTerm"


    // $ANTLR start "entryRuleNumAlt"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1748:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
    public final EObject entryRuleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAlt = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1749:2: (iv_ruleNumAlt= ruleNumAlt EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1750:2: iv_ruleNumAlt= ruleNumAlt EOF
            {
             newCompositeNode(grammarAccess.getNumAltRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumAlt_in_entryRuleNumAlt3945);
            iv_ruleNumAlt=ruleNumAlt();

            state._fsp--;

             current =iv_ruleNumAlt; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumAlt3955); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumAlt"


    // $ANTLR start "ruleNumAlt"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1757:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
    public final EObject ruleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject this_RealTerm_0 = null;

        EObject this_IntegerTerm_1 = null;

        EObject this_SignedConstant_2 = null;

        EObject this_ConstantValue_3 = null;


         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1760:28: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1761:1: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1761:1: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            int alt25=4;
            switch ( input.LA(1) ) {
            case KEYWORD_4:
                {
                switch ( input.LA(2) ) {
                case RULE_INTEGER_LIT:
                    {
                    alt25=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt25=3;
                    }
                    break;
                case RULE_REAL_LIT:
                    {
                    alt25=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }

                }
                break;
            case KEYWORD_6:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt25=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt25=3;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt25=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REAL_LIT:
                {
                alt25=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt25=2;
                }
                break;
            case RULE_ID:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1762:5: this_RealTerm_0= ruleRealTerm
                    {
                     
                            newCompositeNode(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRealTerm_in_ruleNumAlt4002);
                    this_RealTerm_0=ruleRealTerm();

                    state._fsp--;


                            current = this_RealTerm_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1772:5: this_IntegerTerm_1= ruleIntegerTerm
                    {
                     
                            newCompositeNode(grammarAccess.getNumAltAccess().getIntegerTermParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerTerm_in_ruleNumAlt4029);
                    this_IntegerTerm_1=ruleIntegerTerm();

                    state._fsp--;


                            current = this_IntegerTerm_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1782:5: this_SignedConstant_2= ruleSignedConstant
                    {
                     
                            newCompositeNode(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSignedConstant_in_ruleNumAlt4056);
                    this_SignedConstant_2=ruleSignedConstant();

                    state._fsp--;


                            current = this_SignedConstant_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1792:5: this_ConstantValue_3= ruleConstantValue
                    {
                     
                            newCompositeNode(grammarAccess.getNumAltAccess().getConstantValueParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstantValue_in_ruleNumAlt4083);
                    this_ConstantValue_3=ruleConstantValue();

                    state._fsp--;


                            current = this_ConstantValue_3;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumAlt"


    // $ANTLR start "entryRuleINTVALUE"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1808:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
    public final String entryRuleINTVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTVALUE = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1809:1: (iv_ruleINTVALUE= ruleINTVALUE EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1810:2: iv_ruleINTVALUE= ruleINTVALUE EOF
            {
             newCompositeNode(grammarAccess.getINTVALUERule()); 
            pushFollow(FollowSets000.FOLLOW_ruleINTVALUE_in_entryRuleINTVALUE4118);
            iv_ruleINTVALUE=ruleINTVALUE();

            state._fsp--;

             current =iv_ruleINTVALUE.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleINTVALUE4129); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTVALUE"


    // $ANTLR start "ruleINTVALUE"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1817:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1821:6: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1822:5: this_INTEGER_LIT_0= RULE_INTEGER_LIT
            {
            this_INTEGER_LIT_0=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_RULE_INTEGER_LIT_in_ruleINTVALUE4168); 

            		current.merge(this_INTEGER_LIT_0);
                
             
                newLeafNode(this_INTEGER_LIT_0, grammarAccess.getINTVALUEAccess().getINTEGER_LITTerminalRuleCall()); 
                

            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleINTVALUE"


    // $ANTLR start "entryRuleQCLREF"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1837:1: entryRuleQCLREF returns [String current=null] : iv_ruleQCLREF= ruleQCLREF EOF ;
    public final String entryRuleQCLREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCLREF = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1838:1: (iv_ruleQCLREF= ruleQCLREF EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1839:2: iv_ruleQCLREF= ruleQCLREF EOF
            {
             newCompositeNode(grammarAccess.getQCLREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQCLREF_in_entryRuleQCLREF4212);
            iv_ruleQCLREF=ruleQCLREF();

            state._fsp--;

             current =iv_ruleQCLREF.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQCLREF4223); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQCLREF"


    // $ANTLR start "ruleQCLREF"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1846:1: ruleQCLREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= KEYWORD_14 this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleQCLREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1850:6: ( (this_ID_0= RULE_ID kw= KEYWORD_14 this_ID_2= RULE_ID ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1851:1: (this_ID_0= RULE_ID kw= KEYWORD_14 this_ID_2= RULE_ID )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1851:1: (this_ID_0= RULE_ID kw= KEYWORD_14 this_ID_2= RULE_ID )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1851:6: this_ID_0= RULE_ID kw= KEYWORD_14 this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQCLREF4263); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQCLREFAccess().getIDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,KEYWORD_14,FollowSets000.FOLLOW_KEYWORD_14_in_ruleQCLREF4281); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getQCLREFAccess().getColonColonKeyword_1()); 
                
            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQCLREF4296); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getQCLREFAccess().getIDTerminalRuleCall_2()); 
                

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQCLREF"


    // $ANTLR start "entryRuleQPREF"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1879:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1880:1: (iv_ruleQPREF= ruleQPREF EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1881:2: iv_ruleQPREF= ruleQPREF EOF
            {
             newCompositeNode(grammarAccess.getQPREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQPREF_in_entryRuleQPREF4341);
            iv_ruleQPREF=ruleQPREF();

            state._fsp--;

             current =iv_ruleQPREF.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQPREF4352); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQPREF"


    // $ANTLR start "ruleQPREF"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1888:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= KEYWORD_14 this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1892:6: ( (this_ID_0= RULE_ID (kw= KEYWORD_14 this_ID_2= RULE_ID )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1893:1: (this_ID_0= RULE_ID (kw= KEYWORD_14 this_ID_2= RULE_ID )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1893:1: (this_ID_0= RULE_ID (kw= KEYWORD_14 this_ID_2= RULE_ID )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1893:6: this_ID_0= RULE_ID (kw= KEYWORD_14 this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQPREF4392); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1900:1: (kw= KEYWORD_14 this_ID_2= RULE_ID )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KEYWORD_14) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1901:2: kw= KEYWORD_14 this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,KEYWORD_14,FollowSets000.FOLLOW_KEYWORD_14_in_ruleQPREF4411); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); 
                        
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQPREF4426); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQPREF"


    // $ANTLR start "entryRuleQCREF"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1921:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1922:1: (iv_ruleQCREF= ruleQCREF EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1923:2: iv_ruleQCREF= ruleQCREF EOF
            {
             newCompositeNode(grammarAccess.getQCREFRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleQCREF_in_entryRuleQCREF4473);
            iv_ruleQCREF=ruleQCREF();

            state._fsp--;

             current =iv_ruleQCREF.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQCREF4484); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQCREF"


    // $ANTLR start "ruleQCREF"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1930:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= KEYWORD_14 )* this_ID_2= RULE_ID (kw= KEYWORD_7 this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1934:6: ( ( (this_ID_0= RULE_ID kw= KEYWORD_14 )* this_ID_2= RULE_ID (kw= KEYWORD_7 this_ID_4= RULE_ID )? ) )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1935:1: ( (this_ID_0= RULE_ID kw= KEYWORD_14 )* this_ID_2= RULE_ID (kw= KEYWORD_7 this_ID_4= RULE_ID )? )
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1935:1: ( (this_ID_0= RULE_ID kw= KEYWORD_14 )* this_ID_2= RULE_ID (kw= KEYWORD_7 this_ID_4= RULE_ID )? )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1935:2: (this_ID_0= RULE_ID kw= KEYWORD_14 )* this_ID_2= RULE_ID (kw= KEYWORD_7 this_ID_4= RULE_ID )?
            {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1935:2: (this_ID_0= RULE_ID kw= KEYWORD_14 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==KEYWORD_14) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1935:7: this_ID_0= RULE_ID kw= KEYWORD_14
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQCREF4525); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,KEYWORD_14,FollowSets000.FOLLOW_KEYWORD_14_in_ruleQCREF4543); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQCREF4560); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1()); 
                
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1955:1: (kw= KEYWORD_7 this_ID_4= RULE_ID )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==KEYWORD_7) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1956:2: kw= KEYWORD_7 this_ID_4= RULE_ID
                    {
                    kw=(Token)match(input,KEYWORD_7,FollowSets000.FOLLOW_KEYWORD_7_in_ruleQCREF4579); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQCREFAccess().getFullStopKeyword_2_0()); 
                        
                    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQCREF4594); 

                    		current.merge(this_ID_4);
                        
                     
                        newLeafNode(this_ID_4, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQCREF"


    // $ANTLR start "entryRuleSTAR"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1976:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1977:1: (iv_ruleSTAR= ruleSTAR EOF )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1978:2: iv_ruleSTAR= ruleSTAR EOF
            {
             newCompositeNode(grammarAccess.getSTARRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSTAR_in_entryRuleSTAR4641);
            iv_ruleSTAR=ruleSTAR();

            state._fsp--;

             current =iv_ruleSTAR.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSTAR4652); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTAR"


    // $ANTLR start "ruleSTAR"
    // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1985:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= KEYWORD_3 ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1989:6: (kw= KEYWORD_3 )
            // ../org.osate.xtext.aadl2.properties/src-gen/org/osate/xtext/aadl2/properties/parser/antlr/internal/InternalPropertiesParser.g:1991:2: kw= KEYWORD_3
            {
            kw=(Token)match(input,KEYWORD_3,FollowSets000.FOLLOW_KEYWORD_3_in_ruleSTAR4689); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSTARAccess().getAsteriskKeyword()); 
                

            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSTAR"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\25\uffff";
    static final String DFA10_eofS =
        "\10\uffff\1\17\1\21\1\23\3\uffff\1\17\1\uffff\1\21\3\uffff\1\23";
    static final String DFA10_minS =
        "\1\4\5\uffff\2\44\3\7\3\uffff\1\7\1\uffff\1\7\1\uffff\1\52\1\uffff"+
        "\1\7";
    static final String DFA10_maxS =
        "\1\52\5\uffff\4\52\1\33\3\uffff\1\33\1\uffff\1\33\1\uffff\1\52\1"+
        "\uffff\1\33";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\11\1\12\1\6\1\uffff\1\7\1"+
        "\uffff\1\10\1\uffff\1\13\1\uffff";
    static final String DFA10_specialS =
        "\25\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\3\1\2\3\uffff\1\4\1\uffff\1\14\1\uffff\1\14\6\uffff\1\13"+
            "\2\uffff\1\6\1\uffff\1\7\2\uffff\1\1\7\uffff\1\10\1\uffff\1"+
            "\11\2\uffff\1\5\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\10\1\uffff\1\11\3\uffff\1\15",
            "\1\10\1\uffff\1\11\3\uffff\1\15",
            "\1\17\7\uffff\1\15\2\uffff\1\17\2\uffff\1\17\2\uffff\1\17\2"+
            "\uffff\1\17\16\uffff\1\16",
            "\1\21\7\uffff\1\15\2\uffff\1\21\2\uffff\1\21\2\uffff\1\21\2"+
            "\uffff\1\21\16\uffff\1\20",
            "\1\23\7\uffff\1\15\1\22\1\uffff\1\23\2\uffff\1\23\2\uffff\1"+
            "\23\2\uffff\1\23",
            "",
            "",
            "",
            "\1\17\7\uffff\1\15\2\uffff\1\17\2\uffff\1\17\2\uffff\1\17\2"+
            "\uffff\1\17",
            "",
            "\1\21\7\uffff\1\15\2\uffff\1\21\2\uffff\1\21\2\uffff\1\21\2"+
            "\uffff\1\21",
            "",
            "\1\24",
            "",
            "\1\23\7\uffff\1\15\2\uffff\1\23\2\uffff\1\23\2\uffff\1\23\2"+
            "\uffff\1\23"
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "513:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePModel_in_entryRulePModel67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePModel77 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainedPropertyAssociation_in_rulePModel123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainedPropertyAssociation_in_entryRuleContainedPropertyAssociation156 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContainedPropertyAssociation166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQPREF_in_ruleContainedPropertyAssociation214 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_KEYWORD_15_in_ruleContainedPropertyAssociation228 = new BitSet(new long[]{0x0000065012902A70L});
        public static final BitSet FOLLOW_KEYWORD_18_in_ruleContainedPropertyAssociation252 = new BitSet(new long[]{0x0000065012902A70L});
        public static final BitSet FOLLOW_KEYWORD_26_in_ruleContainedPropertyAssociation283 = new BitSet(new long[]{0x0000065012902A70L});
        public static final BitSet FOLLOW_ruleOptionalModalPropertyValue_in_ruleContainedPropertyAssociation317 = new BitSet(new long[]{0x0000000009040080L});
        public static final BitSet FOLLOW_KEYWORD_5_in_ruleContainedPropertyAssociation331 = new BitSet(new long[]{0x0000065012902A70L});
        public static final BitSet FOLLOW_ruleOptionalModalPropertyValue_in_ruleContainedPropertyAssociation351 = new BitSet(new long[]{0x0000000009040080L});
        public static final BitSet FOLLOW_KEYWORD_23_in_ruleContainedPropertyAssociation368 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_KEYWORD_17_in_ruleContainedPropertyAssociation380 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleContainmentPath_in_ruleContainedPropertyAssociation400 = new BitSet(new long[]{0x0000000009040000L});
        public static final BitSet FOLLOW_KEYWORD_5_in_ruleContainedPropertyAssociation414 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleContainmentPath_in_ruleContainedPropertyAssociation434 = new BitSet(new long[]{0x0000000009040000L});
        public static final BitSet FOLLOW_KEYWORD_16_in_ruleContainedPropertyAssociation452 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_KEYWORD_24_in_ruleContainedPropertyAssociation464 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleContainedPropertyAssociation476 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleQCREF_in_ruleContainedPropertyAssociation498 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleContainedPropertyAssociation511 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_KEYWORD_8_in_ruleContainedPropertyAssociation525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainmentPath_in_entryRuleContainmentPath563 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContainmentPath573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainmentPathElement_in_ruleContainmentPath628 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_KEYWORD_7_in_ruleContainmentPath642 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleContainmentPathElement_in_ruleContainmentPath662 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleOptionalModalPropertyValue_in_entryRuleOptionalModalPropertyValue701 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOptionalModalPropertyValue711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyExpression_in_ruleOptionalModalPropertyValue757 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_KEYWORD_16_in_ruleOptionalModalPropertyValue771 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_KEYWORD_22_in_ruleOptionalModalPropertyValue783 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleOptionalModalPropertyValue795 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOptionalModalPropertyValue814 = new BitSet(new long[]{0x0000000001200000L});
        public static final BitSet FOLLOW_KEYWORD_5_in_ruleOptionalModalPropertyValue828 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOptionalModalPropertyValue847 = new BitSet(new long[]{0x0000000001200000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleOptionalModalPropertyValue862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyValue_in_entryRulePropertyValue898 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyValue908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyExpression_in_rulePropertyValue953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyExpression_in_entryRulePropertyExpression987 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyExpression997 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordTerm_in_rulePropertyExpression1044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceTerm_in_rulePropertyExpression1071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentClassifierTerm_in_rulePropertyExpression1098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComputedTerm_in_rulePropertyExpression1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringTerm_in_rulePropertyExpression1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumericRangeTerm_in_rulePropertyExpression1179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRealTerm_in_rulePropertyExpression1206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerTerm_in_rulePropertyExpression1233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListTerm_in_rulePropertyExpression1260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_rulePropertyExpression1287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralorReferenceTerm_in_rulePropertyExpression1314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralorReferenceTerm_in_entryRuleLiteralorReferenceTerm1348 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralorReferenceTerm1358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQPREF_in_ruleLiteralorReferenceTerm1405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral1439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_19_in_ruleBooleanLiteral1503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_21_in_ruleBooleanLiteral1533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue1568 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue1578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQPREF_in_ruleConstantValue1625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceTerm_in_entryRuleReferenceTerm1659 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferenceTerm1669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_27_in_ruleReferenceTerm1707 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleReferenceTerm1719 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleQualifiedContainmentPathElement_in_ruleReferenceTerm1740 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_KEYWORD_7_in_ruleReferenceTerm1753 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleContainmentPathElement_in_ruleReferenceTerm1775 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_KEYWORD_7_in_ruleReferenceTerm1789 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleContainmentPathElement_in_ruleReferenceTerm1809 = new BitSet(new long[]{0x0000000004200000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleReferenceTerm1824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm1858 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecordTerm1868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_9_in_ruleRecordTerm1906 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleFieldPropertyAssociation_in_ruleRecordTerm1926 = new BitSet(new long[]{0x0000040020000000L});
        public static final BitSet FOLLOW_KEYWORD_10_in_ruleRecordTerm1940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComputedTerm_in_entryRuleComputedTerm1976 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComputedTerm1986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_25_in_ruleComputedTerm2024 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleComputedTerm2036 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleComputedTerm2052 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleComputedTerm2070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComponentClassifierTerm_in_entryRuleComponentClassifierTerm2104 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComponentClassifierTerm2114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_28_in_ruleComponentClassifierTerm2152 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleComponentClassifierTerm2164 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_ruleQCREF_in_ruleComponentClassifierTerm2186 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleComponentClassifierTerm2199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleListTerm_in_entryRuleListTerm2233 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleListTerm2243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_1_in_ruleListTerm2290 = new BitSet(new long[]{0x0000065012B02A70L});
        public static final BitSet FOLLOW_rulePropertyExpression_in_ruleListTerm2311 = new BitSet(new long[]{0x0000000001200000L});
        public static final BitSet FOLLOW_KEYWORD_5_in_ruleListTerm2325 = new BitSet(new long[]{0x0000065012902A70L});
        public static final BitSet FOLLOW_rulePropertyExpression_in_ruleListTerm2345 = new BitSet(new long[]{0x0000000001200000L});
        public static final BitSet FOLLOW_KEYWORD_2_in_ruleListTerm2362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldPropertyAssociation_in_entryRuleFieldPropertyAssociation2396 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldPropertyAssociation2406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFieldPropertyAssociation2451 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_KEYWORD_15_in_ruleFieldPropertyAssociation2464 = new BitSet(new long[]{0x0000065012902A70L});
        public static final BitSet FOLLOW_rulePropertyExpression_in_ruleFieldPropertyAssociation2484 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_KEYWORD_8_in_ruleFieldPropertyAssociation2497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainmentPathElement_in_entryRuleContainmentPathElement2531 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContainmentPathElement2541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleContainmentPathElement2586 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleArrayRange_in_ruleContainmentPathElement2607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedContainmentPathElement_in_entryRuleQualifiedContainmentPathElement2643 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedContainmentPathElement2653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQCLREF_in_ruleQualifiedContainmentPathElement2700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlusMinus_in_entryRulePlusMinus2737 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePlusMinus2748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_4_in_rulePlusMinus2786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_6_in_rulePlusMinus2805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStringTerm_in_entryRuleStringTerm2844 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStringTerm2854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoQuoteString_in_ruleStringTerm2899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNoQuoteString_in_entryRuleNoQuoteString2934 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNoQuoteString2945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleNoQuoteString2984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayRange_in_entryRuleArrayRange3027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayRange3037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_9_in_ruleArrayRange3084 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleINTVALUE_in_ruleArrayRange3104 = new BitSet(new long[]{0x0000000020008000L});
        public static final BitSet FOLLOW_KEYWORD_13_in_ruleArrayRange3118 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleINTVALUE_in_ruleArrayRange3138 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_KEYWORD_10_in_ruleArrayRange3153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignedConstant_in_entryRuleSignedConstant3187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignedConstant3197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePlusMinus_in_ruleSignedConstant3243 = new BitSet(new long[]{0x0000045002800000L});
        public static final BitSet FOLLOW_ruleConstantValue_in_ruleSignedConstant3264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerTerm_in_entryRuleIntegerTerm3299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerTerm3309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignedInt_in_ruleIntegerTerm3355 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleIntegerTerm3375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignedInt_in_entryRuleSignedInt3412 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignedInt3423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_4_in_ruleSignedInt3462 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_KEYWORD_6_in_ruleSignedInt3481 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_RULE_INTEGER_LIT_in_ruleSignedInt3498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRealTerm_in_entryRuleRealTerm3542 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRealTerm3552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignedReal_in_ruleRealTerm3598 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRealTerm3618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignedReal_in_entryRuleSignedReal3655 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignedReal3666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_4_in_ruleSignedReal3705 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_KEYWORD_6_in_ruleSignedReal3724 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_RULE_REAL_LIT_in_ruleSignedReal3741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumericRangeTerm_in_entryRuleNumericRangeTerm3785 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumericRangeTerm3795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumAlt_in_ruleNumericRangeTerm3841 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_KEYWORD_13_in_ruleNumericRangeTerm3854 = new BitSet(new long[]{0x0000045002800000L});
        public static final BitSet FOLLOW_ruleNumAlt_in_ruleNumericRangeTerm3874 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_KEYWORD_20_in_ruleNumericRangeTerm3888 = new BitSet(new long[]{0x0000045002800000L});
        public static final BitSet FOLLOW_ruleNumAlt_in_ruleNumericRangeTerm3908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumAlt_in_entryRuleNumAlt3945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumAlt3955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRealTerm_in_ruleNumAlt4002 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerTerm_in_ruleNumAlt4029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignedConstant_in_ruleNumAlt4056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantValue_in_ruleNumAlt4083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleINTVALUE_in_entryRuleINTVALUE4118 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleINTVALUE4129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INTEGER_LIT_in_ruleINTVALUE4168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQCLREF_in_entryRuleQCLREF4212 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQCLREF4223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQCLREF4263 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_KEYWORD_14_in_ruleQCLREF4281 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQCLREF4296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQPREF_in_entryRuleQPREF4341 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQPREF4352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQPREF4392 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_KEYWORD_14_in_ruleQPREF4411 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQPREF4426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQCREF_in_entryRuleQCREF4473 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQCREF4484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQCREF4525 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_KEYWORD_14_in_ruleQCREF4543 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQCREF4560 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_KEYWORD_7_in_ruleQCREF4579 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQCREF4594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSTAR_in_entryRuleSTAR4641 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSTAR4652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_KEYWORD_3_in_ruleSTAR4689 = new BitSet(new long[]{0x0000000000000002L});
    }


}