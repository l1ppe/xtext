package org.xtext.gmse.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.gmse.services.DomainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FESTIVAL'", "'Visitors'", "'Startdate'", "'Enddate'", "'LINEUP'", "'['", "']'", "'country'", "'STAGELIST'", "'Stage'", "'Capacity'", "'Type'", "'TIMETABLE'", "'Artist'", "'Day'", "'Timeslot'", "'FOODLINEUP'", "'Typ'", "'Ort'", "'Donnerstag'", "'Freitag'", "'Samstag'", "'Sonntag'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDomainParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomain.g"; }



     	private DomainGrammarAccess grammarAccess;

        public InternalDomainParser(TokenStream input, DomainGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Festival";
       	}

       	@Override
       	protected DomainGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleFestival"
    // InternalDomain.g:65:1: entryRuleFestival returns [EObject current=null] : iv_ruleFestival= ruleFestival EOF ;
    public final EObject entryRuleFestival() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFestival = null;


        try {
            // InternalDomain.g:65:49: (iv_ruleFestival= ruleFestival EOF )
            // InternalDomain.g:66:2: iv_ruleFestival= ruleFestival EOF
            {
             newCompositeNode(grammarAccess.getFestivalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFestival=ruleFestival();

            state._fsp--;

             current =iv_ruleFestival; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFestival"


    // $ANTLR start "ruleFestival"
    // InternalDomain.g:72:1: ruleFestival returns [EObject current=null] : (otherlv_0= 'FESTIVAL' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Visitors' ( (lv_visitors_3_0= RULE_INT ) ) otherlv_4= 'Startdate' ( (lv_startdate_5_0= RULE_STRING ) ) otherlv_6= 'Enddate' ( (lv_enddate_7_0= RULE_STRING ) ) ( (lv_lineup_8_0= ruleLineup ) ) ( (lv_stages_9_0= ruleStagelist ) ) ( (lv_timetable_10_0= ruleTimetable ) ) ( (lv_foodLineup_11_0= ruleFoodLineup ) )? ) ;
    public final EObject ruleFestival() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_visitors_3_0=null;
        Token otherlv_4=null;
        Token lv_startdate_5_0=null;
        Token otherlv_6=null;
        Token lv_enddate_7_0=null;
        EObject lv_lineup_8_0 = null;

        EObject lv_stages_9_0 = null;

        EObject lv_timetable_10_0 = null;

        EObject lv_foodLineup_11_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:78:2: ( (otherlv_0= 'FESTIVAL' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Visitors' ( (lv_visitors_3_0= RULE_INT ) ) otherlv_4= 'Startdate' ( (lv_startdate_5_0= RULE_STRING ) ) otherlv_6= 'Enddate' ( (lv_enddate_7_0= RULE_STRING ) ) ( (lv_lineup_8_0= ruleLineup ) ) ( (lv_stages_9_0= ruleStagelist ) ) ( (lv_timetable_10_0= ruleTimetable ) ) ( (lv_foodLineup_11_0= ruleFoodLineup ) )? ) )
            // InternalDomain.g:79:2: (otherlv_0= 'FESTIVAL' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Visitors' ( (lv_visitors_3_0= RULE_INT ) ) otherlv_4= 'Startdate' ( (lv_startdate_5_0= RULE_STRING ) ) otherlv_6= 'Enddate' ( (lv_enddate_7_0= RULE_STRING ) ) ( (lv_lineup_8_0= ruleLineup ) ) ( (lv_stages_9_0= ruleStagelist ) ) ( (lv_timetable_10_0= ruleTimetable ) ) ( (lv_foodLineup_11_0= ruleFoodLineup ) )? )
            {
            // InternalDomain.g:79:2: (otherlv_0= 'FESTIVAL' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Visitors' ( (lv_visitors_3_0= RULE_INT ) ) otherlv_4= 'Startdate' ( (lv_startdate_5_0= RULE_STRING ) ) otherlv_6= 'Enddate' ( (lv_enddate_7_0= RULE_STRING ) ) ( (lv_lineup_8_0= ruleLineup ) ) ( (lv_stages_9_0= ruleStagelist ) ) ( (lv_timetable_10_0= ruleTimetable ) ) ( (lv_foodLineup_11_0= ruleFoodLineup ) )? )
            // InternalDomain.g:80:3: otherlv_0= 'FESTIVAL' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Visitors' ( (lv_visitors_3_0= RULE_INT ) ) otherlv_4= 'Startdate' ( (lv_startdate_5_0= RULE_STRING ) ) otherlv_6= 'Enddate' ( (lv_enddate_7_0= RULE_STRING ) ) ( (lv_lineup_8_0= ruleLineup ) ) ( (lv_stages_9_0= ruleStagelist ) ) ( (lv_timetable_10_0= ruleTimetable ) ) ( (lv_foodLineup_11_0= ruleFoodLineup ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFestivalAccess().getFESTIVALKeyword_0());
            		
            // InternalDomain.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDomain.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDomain.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalDomain.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFestivalAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFestivalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getFestivalAccess().getVisitorsKeyword_2());
            		
            // InternalDomain.g:106:3: ( (lv_visitors_3_0= RULE_INT ) )
            // InternalDomain.g:107:4: (lv_visitors_3_0= RULE_INT )
            {
            // InternalDomain.g:107:4: (lv_visitors_3_0= RULE_INT )
            // InternalDomain.g:108:5: lv_visitors_3_0= RULE_INT
            {
            lv_visitors_3_0=(Token)match(input,RULE_INT,FOLLOW_6); 

            					newLeafNode(lv_visitors_3_0, grammarAccess.getFestivalAccess().getVisitorsINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFestivalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"visitors",
            						lv_visitors_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getFestivalAccess().getStartdateKeyword_4());
            		
            // InternalDomain.g:128:3: ( (lv_startdate_5_0= RULE_STRING ) )
            // InternalDomain.g:129:4: (lv_startdate_5_0= RULE_STRING )
            {
            // InternalDomain.g:129:4: (lv_startdate_5_0= RULE_STRING )
            // InternalDomain.g:130:5: lv_startdate_5_0= RULE_STRING
            {
            lv_startdate_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_startdate_5_0, grammarAccess.getFestivalAccess().getStartdateSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFestivalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"startdate",
            						lv_startdate_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getFestivalAccess().getEnddateKeyword_6());
            		
            // InternalDomain.g:150:3: ( (lv_enddate_7_0= RULE_STRING ) )
            // InternalDomain.g:151:4: (lv_enddate_7_0= RULE_STRING )
            {
            // InternalDomain.g:151:4: (lv_enddate_7_0= RULE_STRING )
            // InternalDomain.g:152:5: lv_enddate_7_0= RULE_STRING
            {
            lv_enddate_7_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_enddate_7_0, grammarAccess.getFestivalAccess().getEnddateSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFestivalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"enddate",
            						lv_enddate_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDomain.g:168:3: ( (lv_lineup_8_0= ruleLineup ) )
            // InternalDomain.g:169:4: (lv_lineup_8_0= ruleLineup )
            {
            // InternalDomain.g:169:4: (lv_lineup_8_0= ruleLineup )
            // InternalDomain.g:170:5: lv_lineup_8_0= ruleLineup
            {

            					newCompositeNode(grammarAccess.getFestivalAccess().getLineupLineupParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_lineup_8_0=ruleLineup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFestivalRule());
            					}
            					set(
            						current,
            						"lineup",
            						lv_lineup_8_0,
            						"org.xtext.gmse.Domain.Lineup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomain.g:187:3: ( (lv_stages_9_0= ruleStagelist ) )
            // InternalDomain.g:188:4: (lv_stages_9_0= ruleStagelist )
            {
            // InternalDomain.g:188:4: (lv_stages_9_0= ruleStagelist )
            // InternalDomain.g:189:5: lv_stages_9_0= ruleStagelist
            {

            					newCompositeNode(grammarAccess.getFestivalAccess().getStagesStagelistParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_stages_9_0=ruleStagelist();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFestivalRule());
            					}
            					set(
            						current,
            						"stages",
            						lv_stages_9_0,
            						"org.xtext.gmse.Domain.Stagelist");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomain.g:206:3: ( (lv_timetable_10_0= ruleTimetable ) )
            // InternalDomain.g:207:4: (lv_timetable_10_0= ruleTimetable )
            {
            // InternalDomain.g:207:4: (lv_timetable_10_0= ruleTimetable )
            // InternalDomain.g:208:5: lv_timetable_10_0= ruleTimetable
            {

            					newCompositeNode(grammarAccess.getFestivalAccess().getTimetableTimetableParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_timetable_10_0=ruleTimetable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFestivalRule());
            					}
            					set(
            						current,
            						"timetable",
            						lv_timetable_10_0,
            						"org.xtext.gmse.Domain.Timetable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDomain.g:225:3: ( (lv_foodLineup_11_0= ruleFoodLineup ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==27) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalDomain.g:226:4: (lv_foodLineup_11_0= ruleFoodLineup )
                    {
                    // InternalDomain.g:226:4: (lv_foodLineup_11_0= ruleFoodLineup )
                    // InternalDomain.g:227:5: lv_foodLineup_11_0= ruleFoodLineup
                    {

                    					newCompositeNode(grammarAccess.getFestivalAccess().getFoodLineupFoodLineupParserRuleCall_11_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_foodLineup_11_0=ruleFoodLineup();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFestivalRule());
                    					}
                    					set(
                    						current,
                    						"foodLineup",
                    						lv_foodLineup_11_0,
                    						"org.xtext.gmse.Domain.FoodLineup");
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
    // $ANTLR end "ruleFestival"


    // $ANTLR start "entryRuleLineup"
    // InternalDomain.g:248:1: entryRuleLineup returns [EObject current=null] : iv_ruleLineup= ruleLineup EOF ;
    public final EObject entryRuleLineup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLineup = null;


        try {
            // InternalDomain.g:248:47: (iv_ruleLineup= ruleLineup EOF )
            // InternalDomain.g:249:2: iv_ruleLineup= ruleLineup EOF
            {
             newCompositeNode(grammarAccess.getLineupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLineup=ruleLineup();

            state._fsp--;

             current =iv_ruleLineup; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLineup"


    // $ANTLR start "ruleLineup"
    // InternalDomain.g:255:1: ruleLineup returns [EObject current=null] : (otherlv_0= 'LINEUP' otherlv_1= '[' ( (lv_artists_2_0= ruleArtist ) )+ otherlv_3= ']' ) ;
    public final EObject ruleLineup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_artists_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:261:2: ( (otherlv_0= 'LINEUP' otherlv_1= '[' ( (lv_artists_2_0= ruleArtist ) )+ otherlv_3= ']' ) )
            // InternalDomain.g:262:2: (otherlv_0= 'LINEUP' otherlv_1= '[' ( (lv_artists_2_0= ruleArtist ) )+ otherlv_3= ']' )
            {
            // InternalDomain.g:262:2: (otherlv_0= 'LINEUP' otherlv_1= '[' ( (lv_artists_2_0= ruleArtist ) )+ otherlv_3= ']' )
            // InternalDomain.g:263:3: otherlv_0= 'LINEUP' otherlv_1= '[' ( (lv_artists_2_0= ruleArtist ) )+ otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getLineupAccess().getLINEUPKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLineupAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalDomain.g:271:3: ( (lv_artists_2_0= ruleArtist ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDomain.g:272:4: (lv_artists_2_0= ruleArtist )
            	    {
            	    // InternalDomain.g:272:4: (lv_artists_2_0= ruleArtist )
            	    // InternalDomain.g:273:5: lv_artists_2_0= ruleArtist
            	    {

            	    					newCompositeNode(grammarAccess.getLineupAccess().getArtistsArtistParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_artists_2_0=ruleArtist();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLineupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"artists",
            	    						lv_artists_2_0,
            	    						"org.xtext.gmse.Domain.Artist");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLineupAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleLineup"


    // $ANTLR start "entryRuleArtist"
    // InternalDomain.g:298:1: entryRuleArtist returns [EObject current=null] : iv_ruleArtist= ruleArtist EOF ;
    public final EObject entryRuleArtist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtist = null;


        try {
            // InternalDomain.g:298:47: (iv_ruleArtist= ruleArtist EOF )
            // InternalDomain.g:299:2: iv_ruleArtist= ruleArtist EOF
            {
             newCompositeNode(grammarAccess.getArtistRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtist=ruleArtist();

            state._fsp--;

             current =iv_ruleArtist; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArtist"


    // $ANTLR start "ruleArtist"
    // InternalDomain.g:305:1: ruleArtist returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'country' ( (lv_country_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleArtist() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_country_2_0=null;


        	enterRule();

        try {
            // InternalDomain.g:311:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'country' ( (lv_country_2_0= RULE_STRING ) ) ) )
            // InternalDomain.g:312:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'country' ( (lv_country_2_0= RULE_STRING ) ) )
            {
            // InternalDomain.g:312:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'country' ( (lv_country_2_0= RULE_STRING ) ) )
            // InternalDomain.g:313:3: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'country' ( (lv_country_2_0= RULE_STRING ) )
            {
            // InternalDomain.g:313:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalDomain.g:314:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalDomain.g:314:4: (lv_name_0_0= RULE_STRING )
            // InternalDomain.g:315:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_name_0_0, grammarAccess.getArtistAccess().getNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArtistRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getArtistAccess().getCountryKeyword_1());
            		
            // InternalDomain.g:335:3: ( (lv_country_2_0= RULE_STRING ) )
            // InternalDomain.g:336:4: (lv_country_2_0= RULE_STRING )
            {
            // InternalDomain.g:336:4: (lv_country_2_0= RULE_STRING )
            // InternalDomain.g:337:5: lv_country_2_0= RULE_STRING
            {
            lv_country_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_country_2_0, grammarAccess.getArtistAccess().getCountrySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArtistRule());
            					}
            					setWithLastConsumed(
            						current,
            						"country",
            						lv_country_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleArtist"


    // $ANTLR start "entryRuleStagelist"
    // InternalDomain.g:357:1: entryRuleStagelist returns [EObject current=null] : iv_ruleStagelist= ruleStagelist EOF ;
    public final EObject entryRuleStagelist() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStagelist = null;


        try {
            // InternalDomain.g:357:50: (iv_ruleStagelist= ruleStagelist EOF )
            // InternalDomain.g:358:2: iv_ruleStagelist= ruleStagelist EOF
            {
             newCompositeNode(grammarAccess.getStagelistRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStagelist=ruleStagelist();

            state._fsp--;

             current =iv_ruleStagelist; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStagelist"


    // $ANTLR start "ruleStagelist"
    // InternalDomain.g:364:1: ruleStagelist returns [EObject current=null] : (otherlv_0= 'STAGELIST' otherlv_1= '[' ( (lv_stages_2_0= ruleStage ) )+ otherlv_3= ']' ) ;
    public final EObject ruleStagelist() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_stages_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:370:2: ( (otherlv_0= 'STAGELIST' otherlv_1= '[' ( (lv_stages_2_0= ruleStage ) )+ otherlv_3= ']' ) )
            // InternalDomain.g:371:2: (otherlv_0= 'STAGELIST' otherlv_1= '[' ( (lv_stages_2_0= ruleStage ) )+ otherlv_3= ']' )
            {
            // InternalDomain.g:371:2: (otherlv_0= 'STAGELIST' otherlv_1= '[' ( (lv_stages_2_0= ruleStage ) )+ otherlv_3= ']' )
            // InternalDomain.g:372:3: otherlv_0= 'STAGELIST' otherlv_1= '[' ( (lv_stages_2_0= ruleStage ) )+ otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getStagelistAccess().getSTAGELISTKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getStagelistAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalDomain.g:380:3: ( (lv_stages_2_0= ruleStage ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDomain.g:381:4: (lv_stages_2_0= ruleStage )
            	    {
            	    // InternalDomain.g:381:4: (lv_stages_2_0= ruleStage )
            	    // InternalDomain.g:382:5: lv_stages_2_0= ruleStage
            	    {

            	    					newCompositeNode(grammarAccess.getStagelistAccess().getStagesStageParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_stages_2_0=ruleStage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStagelistRule());
            	    					}
            	    					add(
            	    						current,
            	    						"stages",
            	    						lv_stages_2_0,
            	    						"org.xtext.gmse.Domain.Stage");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStagelistAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleStagelist"


    // $ANTLR start "entryRuleStage"
    // InternalDomain.g:407:1: entryRuleStage returns [EObject current=null] : iv_ruleStage= ruleStage EOF ;
    public final EObject entryRuleStage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStage = null;


        try {
            // InternalDomain.g:407:46: (iv_ruleStage= ruleStage EOF )
            // InternalDomain.g:408:2: iv_ruleStage= ruleStage EOF
            {
             newCompositeNode(grammarAccess.getStageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStage=ruleStage();

            state._fsp--;

             current =iv_ruleStage; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStage"


    // $ANTLR start "ruleStage"
    // InternalDomain.g:414:1: ruleStage returns [EObject current=null] : (otherlv_0= 'Stage' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'Type' ( (lv_info_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleStage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_capacity_3_0=null;
        Token otherlv_4=null;
        Token lv_info_5_0=null;


        	enterRule();

        try {
            // InternalDomain.g:420:2: ( (otherlv_0= 'Stage' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'Type' ( (lv_info_5_0= RULE_STRING ) ) ) )
            // InternalDomain.g:421:2: (otherlv_0= 'Stage' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'Type' ( (lv_info_5_0= RULE_STRING ) ) )
            {
            // InternalDomain.g:421:2: (otherlv_0= 'Stage' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'Type' ( (lv_info_5_0= RULE_STRING ) ) )
            // InternalDomain.g:422:3: otherlv_0= 'Stage' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= 'Capacity' ( (lv_capacity_3_0= RULE_INT ) ) otherlv_4= 'Type' ( (lv_info_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStageAccess().getStageKeyword_0());
            		
            // InternalDomain.g:426:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalDomain.g:427:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalDomain.g:427:4: (lv_name_1_0= RULE_STRING )
            // InternalDomain.g:428:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStageAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getStageAccess().getCapacityKeyword_2());
            		
            // InternalDomain.g:448:3: ( (lv_capacity_3_0= RULE_INT ) )
            // InternalDomain.g:449:4: (lv_capacity_3_0= RULE_INT )
            {
            // InternalDomain.g:449:4: (lv_capacity_3_0= RULE_INT )
            // InternalDomain.g:450:5: lv_capacity_3_0= RULE_INT
            {
            lv_capacity_3_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_capacity_3_0, grammarAccess.getStageAccess().getCapacityINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"capacity",
            						lv_capacity_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getStageAccess().getTypeKeyword_4());
            		
            // InternalDomain.g:470:3: ( (lv_info_5_0= RULE_STRING ) )
            // InternalDomain.g:471:4: (lv_info_5_0= RULE_STRING )
            {
            // InternalDomain.g:471:4: (lv_info_5_0= RULE_STRING )
            // InternalDomain.g:472:5: lv_info_5_0= RULE_STRING
            {
            lv_info_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_info_5_0, grammarAccess.getStageAccess().getInfoSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"info",
            						lv_info_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleStage"


    // $ANTLR start "entryRuleTimetable"
    // InternalDomain.g:492:1: entryRuleTimetable returns [EObject current=null] : iv_ruleTimetable= ruleTimetable EOF ;
    public final EObject entryRuleTimetable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimetable = null;


        try {
            // InternalDomain.g:492:50: (iv_ruleTimetable= ruleTimetable EOF )
            // InternalDomain.g:493:2: iv_ruleTimetable= ruleTimetable EOF
            {
             newCompositeNode(grammarAccess.getTimetableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimetable=ruleTimetable();

            state._fsp--;

             current =iv_ruleTimetable; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTimetable"


    // $ANTLR start "ruleTimetable"
    // InternalDomain.g:499:1: ruleTimetable returns [EObject current=null] : (otherlv_0= 'TIMETABLE' otherlv_1= '[' ( (lv_timetable_2_0= ruleTimetableEntry ) )+ otherlv_3= ']' ) ;
    public final EObject ruleTimetable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_timetable_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:505:2: ( (otherlv_0= 'TIMETABLE' otherlv_1= '[' ( (lv_timetable_2_0= ruleTimetableEntry ) )+ otherlv_3= ']' ) )
            // InternalDomain.g:506:2: (otherlv_0= 'TIMETABLE' otherlv_1= '[' ( (lv_timetable_2_0= ruleTimetableEntry ) )+ otherlv_3= ']' )
            {
            // InternalDomain.g:506:2: (otherlv_0= 'TIMETABLE' otherlv_1= '[' ( (lv_timetable_2_0= ruleTimetableEntry ) )+ otherlv_3= ']' )
            // InternalDomain.g:507:3: otherlv_0= 'TIMETABLE' otherlv_1= '[' ( (lv_timetable_2_0= ruleTimetableEntry ) )+ otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getTimetableAccess().getTIMETABLEKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTimetableAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalDomain.g:515:3: ( (lv_timetable_2_0= ruleTimetableEntry ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomain.g:516:4: (lv_timetable_2_0= ruleTimetableEntry )
            	    {
            	    // InternalDomain.g:516:4: (lv_timetable_2_0= ruleTimetableEntry )
            	    // InternalDomain.g:517:5: lv_timetable_2_0= ruleTimetableEntry
            	    {

            	    					newCompositeNode(grammarAccess.getTimetableAccess().getTimetableTimetableEntryParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_timetable_2_0=ruleTimetableEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTimetableRule());
            	    					}
            	    					add(
            	    						current,
            	    						"timetable",
            	    						lv_timetable_2_0,
            	    						"org.xtext.gmse.Domain.TimetableEntry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTimetableAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleTimetable"


    // $ANTLR start "entryRuleTimetableEntry"
    // InternalDomain.g:542:1: entryRuleTimetableEntry returns [EObject current=null] : iv_ruleTimetableEntry= ruleTimetableEntry EOF ;
    public final EObject entryRuleTimetableEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimetableEntry = null;


        try {
            // InternalDomain.g:542:55: (iv_ruleTimetableEntry= ruleTimetableEntry EOF )
            // InternalDomain.g:543:2: iv_ruleTimetableEntry= ruleTimetableEntry EOF
            {
             newCompositeNode(grammarAccess.getTimetableEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimetableEntry=ruleTimetableEntry();

            state._fsp--;

             current =iv_ruleTimetableEntry; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTimetableEntry"


    // $ANTLR start "ruleTimetableEntry"
    // InternalDomain.g:549:1: ruleTimetableEntry returns [EObject current=null] : (otherlv_0= 'Artist' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Day' ( (lv_day_3_0= ruledays ) ) otherlv_4= 'Timeslot' ( (lv_time_5_0= RULE_STRING ) ) otherlv_6= 'Stage' ( (otherlv_7= RULE_STRING ) ) ) ;
    public final EObject ruleTimetableEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_time_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_day_3_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:555:2: ( (otherlv_0= 'Artist' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Day' ( (lv_day_3_0= ruledays ) ) otherlv_4= 'Timeslot' ( (lv_time_5_0= RULE_STRING ) ) otherlv_6= 'Stage' ( (otherlv_7= RULE_STRING ) ) ) )
            // InternalDomain.g:556:2: (otherlv_0= 'Artist' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Day' ( (lv_day_3_0= ruledays ) ) otherlv_4= 'Timeslot' ( (lv_time_5_0= RULE_STRING ) ) otherlv_6= 'Stage' ( (otherlv_7= RULE_STRING ) ) )
            {
            // InternalDomain.g:556:2: (otherlv_0= 'Artist' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Day' ( (lv_day_3_0= ruledays ) ) otherlv_4= 'Timeslot' ( (lv_time_5_0= RULE_STRING ) ) otherlv_6= 'Stage' ( (otherlv_7= RULE_STRING ) ) )
            // InternalDomain.g:557:3: otherlv_0= 'Artist' ( (otherlv_1= RULE_STRING ) ) otherlv_2= 'Day' ( (lv_day_3_0= ruledays ) ) otherlv_4= 'Timeslot' ( (lv_time_5_0= RULE_STRING ) ) otherlv_6= 'Stage' ( (otherlv_7= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTimetableEntryAccess().getArtistKeyword_0());
            		
            // InternalDomain.g:561:3: ( (otherlv_1= RULE_STRING ) )
            // InternalDomain.g:562:4: (otherlv_1= RULE_STRING )
            {
            // InternalDomain.g:562:4: (otherlv_1= RULE_STRING )
            // InternalDomain.g:563:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimetableEntryRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getTimetableEntryAccess().getNameArtistCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getTimetableEntryAccess().getDayKeyword_2());
            		
            // InternalDomain.g:578:3: ( (lv_day_3_0= ruledays ) )
            // InternalDomain.g:579:4: (lv_day_3_0= ruledays )
            {
            // InternalDomain.g:579:4: (lv_day_3_0= ruledays )
            // InternalDomain.g:580:5: lv_day_3_0= ruledays
            {

            					newCompositeNode(grammarAccess.getTimetableEntryAccess().getDayDaysEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_day_3_0=ruledays();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimetableEntryRule());
            					}
            					set(
            						current,
            						"day",
            						lv_day_3_0,
            						"org.xtext.gmse.Domain.days");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTimetableEntryAccess().getTimeslotKeyword_4());
            		
            // InternalDomain.g:601:3: ( (lv_time_5_0= RULE_STRING ) )
            // InternalDomain.g:602:4: (lv_time_5_0= RULE_STRING )
            {
            // InternalDomain.g:602:4: (lv_time_5_0= RULE_STRING )
            // InternalDomain.g:603:5: lv_time_5_0= RULE_STRING
            {
            lv_time_5_0=(Token)match(input,RULE_STRING,FOLLOW_15); 

            					newLeafNode(lv_time_5_0, grammarAccess.getTimetableEntryAccess().getTimeSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimetableEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTimetableEntryAccess().getStageKeyword_6());
            		
            // InternalDomain.g:623:3: ( (otherlv_7= RULE_STRING ) )
            // InternalDomain.g:624:4: (otherlv_7= RULE_STRING )
            {
            // InternalDomain.g:624:4: (otherlv_7= RULE_STRING )
            // InternalDomain.g:625:5: otherlv_7= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimetableEntryRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(otherlv_7, grammarAccess.getTimetableEntryAccess().getStageStageCrossReference_7_0());
            				

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
    // $ANTLR end "ruleTimetableEntry"


    // $ANTLR start "entryRuleFoodLineup"
    // InternalDomain.g:640:1: entryRuleFoodLineup returns [EObject current=null] : iv_ruleFoodLineup= ruleFoodLineup EOF ;
    public final EObject entryRuleFoodLineup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFoodLineup = null;


        try {
            // InternalDomain.g:640:51: (iv_ruleFoodLineup= ruleFoodLineup EOF )
            // InternalDomain.g:641:2: iv_ruleFoodLineup= ruleFoodLineup EOF
            {
             newCompositeNode(grammarAccess.getFoodLineupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFoodLineup=ruleFoodLineup();

            state._fsp--;

             current =iv_ruleFoodLineup; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFoodLineup"


    // $ANTLR start "ruleFoodLineup"
    // InternalDomain.g:647:1: ruleFoodLineup returns [EObject current=null] : (otherlv_0= 'FOODLINEUP' otherlv_1= '[' ( (lv_foodlist_2_0= ruleFood ) )+ otherlv_3= ']' ) ;
    public final EObject ruleFoodLineup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_foodlist_2_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:653:2: ( (otherlv_0= 'FOODLINEUP' otherlv_1= '[' ( (lv_foodlist_2_0= ruleFood ) )+ otherlv_3= ']' ) )
            // InternalDomain.g:654:2: (otherlv_0= 'FOODLINEUP' otherlv_1= '[' ( (lv_foodlist_2_0= ruleFood ) )+ otherlv_3= ']' )
            {
            // InternalDomain.g:654:2: (otherlv_0= 'FOODLINEUP' otherlv_1= '[' ( (lv_foodlist_2_0= ruleFood ) )+ otherlv_3= ']' )
            // InternalDomain.g:655:3: otherlv_0= 'FOODLINEUP' otherlv_1= '[' ( (lv_foodlist_2_0= ruleFood ) )+ otherlv_3= ']'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getFoodLineupAccess().getFOODLINEUPKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFoodLineupAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalDomain.g:663:3: ( (lv_foodlist_2_0= ruleFood ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDomain.g:664:4: (lv_foodlist_2_0= ruleFood )
            	    {
            	    // InternalDomain.g:664:4: (lv_foodlist_2_0= ruleFood )
            	    // InternalDomain.g:665:5: lv_foodlist_2_0= ruleFood
            	    {

            	    					newCompositeNode(grammarAccess.getFoodLineupAccess().getFoodlistFoodParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_foodlist_2_0=ruleFood();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFoodLineupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"foodlist",
            	    						lv_foodlist_2_0,
            	    						"org.xtext.gmse.Domain.Food");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFoodLineupAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleFoodLineup"


    // $ANTLR start "entryRuleFood"
    // InternalDomain.g:690:1: entryRuleFood returns [EObject current=null] : iv_ruleFood= ruleFood EOF ;
    public final EObject entryRuleFood() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFood = null;


        try {
            // InternalDomain.g:690:45: (iv_ruleFood= ruleFood EOF )
            // InternalDomain.g:691:2: iv_ruleFood= ruleFood EOF
            {
             newCompositeNode(grammarAccess.getFoodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFood=ruleFood();

            state._fsp--;

             current =iv_ruleFood; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFood"


    // $ANTLR start "ruleFood"
    // InternalDomain.g:697:1: ruleFood returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'Typ' ( (lv_type_2_0= RULE_STRING ) ) otherlv_3= 'Ort' ( (lv_place_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleFood() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_type_2_0=null;
        Token otherlv_3=null;
        Token lv_place_4_0=null;


        	enterRule();

        try {
            // InternalDomain.g:703:2: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'Typ' ( (lv_type_2_0= RULE_STRING ) ) otherlv_3= 'Ort' ( (lv_place_4_0= RULE_STRING ) ) ) )
            // InternalDomain.g:704:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'Typ' ( (lv_type_2_0= RULE_STRING ) ) otherlv_3= 'Ort' ( (lv_place_4_0= RULE_STRING ) ) )
            {
            // InternalDomain.g:704:2: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'Typ' ( (lv_type_2_0= RULE_STRING ) ) otherlv_3= 'Ort' ( (lv_place_4_0= RULE_STRING ) ) )
            // InternalDomain.g:705:3: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= 'Typ' ( (lv_type_2_0= RULE_STRING ) ) otherlv_3= 'Ort' ( (lv_place_4_0= RULE_STRING ) )
            {
            // InternalDomain.g:705:3: ( (lv_name_0_0= RULE_STRING ) )
            // InternalDomain.g:706:4: (lv_name_0_0= RULE_STRING )
            {
            // InternalDomain.g:706:4: (lv_name_0_0= RULE_STRING )
            // InternalDomain.g:707:5: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFoodAccess().getNameSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFoodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFoodAccess().getTypKeyword_1());
            		
            // InternalDomain.g:727:3: ( (lv_type_2_0= RULE_STRING ) )
            // InternalDomain.g:728:4: (lv_type_2_0= RULE_STRING )
            {
            // InternalDomain.g:728:4: (lv_type_2_0= RULE_STRING )
            // InternalDomain.g:729:5: lv_type_2_0= RULE_STRING
            {
            lv_type_2_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_type_2_0, grammarAccess.getFoodAccess().getTypeSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFoodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFoodAccess().getOrtKeyword_3());
            		
            // InternalDomain.g:749:3: ( (lv_place_4_0= RULE_STRING ) )
            // InternalDomain.g:750:4: (lv_place_4_0= RULE_STRING )
            {
            // InternalDomain.g:750:4: (lv_place_4_0= RULE_STRING )
            // InternalDomain.g:751:5: lv_place_4_0= RULE_STRING
            {
            lv_place_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_place_4_0, grammarAccess.getFoodAccess().getPlaceSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFoodRule());
            					}
            					setWithLastConsumed(
            						current,
            						"place",
            						lv_place_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleFood"


    // $ANTLR start "ruledays"
    // InternalDomain.g:771:1: ruledays returns [Enumerator current=null] : ( (enumLiteral_0= 'Donnerstag' ) | (enumLiteral_1= 'Freitag' ) | (enumLiteral_2= 'Samstag' ) | (enumLiteral_3= 'Sonntag' ) ) ;
    public final Enumerator ruledays() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDomain.g:777:2: ( ( (enumLiteral_0= 'Donnerstag' ) | (enumLiteral_1= 'Freitag' ) | (enumLiteral_2= 'Samstag' ) | (enumLiteral_3= 'Sonntag' ) ) )
            // InternalDomain.g:778:2: ( (enumLiteral_0= 'Donnerstag' ) | (enumLiteral_1= 'Freitag' ) | (enumLiteral_2= 'Samstag' ) | (enumLiteral_3= 'Sonntag' ) )
            {
            // InternalDomain.g:778:2: ( (enumLiteral_0= 'Donnerstag' ) | (enumLiteral_1= 'Freitag' ) | (enumLiteral_2= 'Samstag' ) | (enumLiteral_3= 'Sonntag' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt6=1;
                }
                break;
            case 31:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            case 33:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDomain.g:779:3: (enumLiteral_0= 'Donnerstag' )
                    {
                    // InternalDomain.g:779:3: (enumLiteral_0= 'Donnerstag' )
                    // InternalDomain.g:780:4: enumLiteral_0= 'Donnerstag'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getDaysAccess().getTHURSDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDaysAccess().getTHURSDAYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:787:3: (enumLiteral_1= 'Freitag' )
                    {
                    // InternalDomain.g:787:3: (enumLiteral_1= 'Freitag' )
                    // InternalDomain.g:788:4: enumLiteral_1= 'Freitag'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getDaysAccess().getFRIDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDaysAccess().getFRIDAYEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomain.g:795:3: (enumLiteral_2= 'Samstag' )
                    {
                    // InternalDomain.g:795:3: (enumLiteral_2= 'Samstag' )
                    // InternalDomain.g:796:4: enumLiteral_2= 'Samstag'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getDaysAccess().getSATURDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDaysAccess().getSATURDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDomain.g:803:3: (enumLiteral_3= 'Sonntag' )
                    {
                    // InternalDomain.g:803:3: (enumLiteral_3= 'Sonntag' )
                    // InternalDomain.g:804:4: enumLiteral_3= 'Sonntag'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getDaysAccess().getSUNDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDaysAccess().getSUNDAYEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruledays"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});

}