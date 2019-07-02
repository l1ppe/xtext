/*
 * generated by Xtext 2.18.0
 */
grammar InternalDomain;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.gmse.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFestival
entryRuleFestival returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFestivalRule()); }
	iv_ruleFestival=ruleFestival
	{ $current=$iv_ruleFestival.current; }
	EOF;

// Rule Festival
ruleFestival returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='FESTIVAL'
		{
			newLeafNode(otherlv_0, grammarAccess.getFestivalAccess().getFESTIVALKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFestivalAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFestivalRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='Visitors'
		{
			newLeafNode(otherlv_2, grammarAccess.getFestivalAccess().getVisitorsKeyword_2());
		}
		(
			(
				lv_visitors_3_0=RULE_INT
				{
					newLeafNode(lv_visitors_3_0, grammarAccess.getFestivalAccess().getVisitorsINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFestivalRule());
					}
					setWithLastConsumed(
						$current,
						"visitors",
						lv_visitors_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4='Startdate'
		{
			newLeafNode(otherlv_4, grammarAccess.getFestivalAccess().getStartdateKeyword_4());
		}
		(
			(
				lv_startdate_5_0=RULE_STRING
				{
					newLeafNode(lv_startdate_5_0, grammarAccess.getFestivalAccess().getStartdateSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFestivalRule());
					}
					setWithLastConsumed(
						$current,
						"startdate",
						lv_startdate_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_6='Enddate'
		{
			newLeafNode(otherlv_6, grammarAccess.getFestivalAccess().getEnddateKeyword_6());
		}
		(
			(
				lv_enddate_7_0=RULE_STRING
				{
					newLeafNode(lv_enddate_7_0, grammarAccess.getFestivalAccess().getEnddateSTRINGTerminalRuleCall_7_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFestivalRule());
					}
					setWithLastConsumed(
						$current,
						"enddate",
						lv_enddate_7_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFestivalAccess().getLineupLineupParserRuleCall_8_0());
				}
				lv_lineup_8_0=ruleLineup
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFestivalRule());
					}
					set(
						$current,
						"lineup",
						lv_lineup_8_0,
						"org.xtext.gmse.Domain.Lineup");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFestivalAccess().getStagesStagelistParserRuleCall_9_0());
				}
				lv_stages_9_0=ruleStagelist
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFestivalRule());
					}
					set(
						$current,
						"stages",
						lv_stages_9_0,
						"org.xtext.gmse.Domain.Stagelist");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFestivalAccess().getTimetableTimetableParserRuleCall_10_0());
				}
				lv_timetable_10_0=ruleTimetable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFestivalRule());
					}
					set(
						$current,
						"timetable",
						lv_timetable_10_0,
						"org.xtext.gmse.Domain.Timetable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFestivalAccess().getFoodLineupFoodLineupParserRuleCall_11_0());
				}
				lv_foodLineup_11_0=ruleFoodLineup
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFestivalRule());
					}
					set(
						$current,
						"foodLineup",
						lv_foodLineup_11_0,
						"org.xtext.gmse.Domain.FoodLineup");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleLineup
entryRuleLineup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLineupRule()); }
	iv_ruleLineup=ruleLineup
	{ $current=$iv_ruleLineup.current; }
	EOF;

// Rule Lineup
ruleLineup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='LINEUP'
		{
			newLeafNode(otherlv_0, grammarAccess.getLineupAccess().getLINEUPKeyword_0());
		}
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getLineupAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLineupAccess().getArtistsArtistParserRuleCall_2_0());
				}
				lv_artists_2_0=ruleArtist
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLineupRule());
					}
					add(
						$current,
						"artists",
						lv_artists_2_0,
						"org.xtext.gmse.Domain.Artist");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getLineupAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleArtist
entryRuleArtist returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArtistRule()); }
	iv_ruleArtist=ruleArtist
	{ $current=$iv_ruleArtist.current; }
	EOF;

// Rule Artist
ruleArtist returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_STRING
				{
					newLeafNode(lv_name_0_0, grammarAccess.getArtistAccess().getNameSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getArtistRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_1='country'
		{
			newLeafNode(otherlv_1, grammarAccess.getArtistAccess().getCountryKeyword_1());
		}
		(
			(
				lv_country_2_0=RULE_STRING
				{
					newLeafNode(lv_country_2_0, grammarAccess.getArtistAccess().getCountrySTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getArtistRule());
					}
					setWithLastConsumed(
						$current,
						"country",
						lv_country_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleStagelist
entryRuleStagelist returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStagelistRule()); }
	iv_ruleStagelist=ruleStagelist
	{ $current=$iv_ruleStagelist.current; }
	EOF;

// Rule Stagelist
ruleStagelist returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='STAGELIST'
		{
			newLeafNode(otherlv_0, grammarAccess.getStagelistAccess().getSTAGELISTKeyword_0());
		}
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getStagelistAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStagelistAccess().getStagesStageParserRuleCall_2_0());
				}
				lv_stages_2_0=ruleStage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStagelistRule());
					}
					add(
						$current,
						"stages",
						lv_stages_2_0,
						"org.xtext.gmse.Domain.Stage");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getStagelistAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleStage
entryRuleStage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStageRule()); }
	iv_ruleStage=ruleStage
	{ $current=$iv_ruleStage.current; }
	EOF;

// Rule Stage
ruleStage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Stage'
		{
			newLeafNode(otherlv_0, grammarAccess.getStageAccess().getStageKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStageAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStageRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='Capacity'
		{
			newLeafNode(otherlv_2, grammarAccess.getStageAccess().getCapacityKeyword_2());
		}
		(
			(
				lv_capacity_3_0=RULE_INT
				{
					newLeafNode(lv_capacity_3_0, grammarAccess.getStageAccess().getCapacityINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStageRule());
					}
					setWithLastConsumed(
						$current,
						"capacity",
						lv_capacity_3_0,
						"org.eclipse.xtext.common.Terminals.INT");
				}
			)
		)
		otherlv_4='Type'
		{
			newLeafNode(otherlv_4, grammarAccess.getStageAccess().getTypeKeyword_4());
		}
		(
			(
				lv_info_5_0=RULE_STRING
				{
					newLeafNode(lv_info_5_0, grammarAccess.getStageAccess().getInfoSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStageRule());
					}
					setWithLastConsumed(
						$current,
						"info",
						lv_info_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleTimetable
entryRuleTimetable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimetableRule()); }
	iv_ruleTimetable=ruleTimetable
	{ $current=$iv_ruleTimetable.current; }
	EOF;

// Rule Timetable
ruleTimetable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TIMETABLE'
		{
			newLeafNode(otherlv_0, grammarAccess.getTimetableAccess().getTIMETABLEKeyword_0());
		}
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getTimetableAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTimetableAccess().getTimetableTimetableEntryParserRuleCall_2_0());
				}
				lv_timetable_2_0=ruleTimetableEntry
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTimetableRule());
					}
					add(
						$current,
						"timetable",
						lv_timetable_2_0,
						"org.xtext.gmse.Domain.TimetableEntry");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getTimetableAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleTimetableEntry
entryRuleTimetableEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTimetableEntryRule()); }
	iv_ruleTimetableEntry=ruleTimetableEntry
	{ $current=$iv_ruleTimetableEntry.current; }
	EOF;

// Rule TimetableEntry
ruleTimetableEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Artist'
		{
			newLeafNode(otherlv_0, grammarAccess.getTimetableEntryAccess().getArtistKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTimetableEntryRule());
					}
				}
				otherlv_1=RULE_STRING
				{
					newLeafNode(otherlv_1, grammarAccess.getTimetableEntryAccess().getNameArtistCrossReference_1_0());
				}
			)
		)
		otherlv_2='Day'
		{
			newLeafNode(otherlv_2, grammarAccess.getTimetableEntryAccess().getDayKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTimetableEntryAccess().getDayDaysEnumRuleCall_3_0());
				}
				lv_day_3_0=ruledays
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTimetableEntryRule());
					}
					set(
						$current,
						"day",
						lv_day_3_0,
						"org.xtext.gmse.Domain.days");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='Timeslot'
		{
			newLeafNode(otherlv_4, grammarAccess.getTimetableEntryAccess().getTimeslotKeyword_4());
		}
		(
			(
				lv_time_5_0=RULE_STRING
				{
					newLeafNode(lv_time_5_0, grammarAccess.getTimetableEntryAccess().getTimeSTRINGTerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTimetableEntryRule());
					}
					setWithLastConsumed(
						$current,
						"time",
						lv_time_5_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_6='Stage'
		{
			newLeafNode(otherlv_6, grammarAccess.getTimetableEntryAccess().getStageKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTimetableEntryRule());
					}
				}
				otherlv_7=RULE_STRING
				{
					newLeafNode(otherlv_7, grammarAccess.getTimetableEntryAccess().getStageStageCrossReference_7_0());
				}
			)
		)
	)
;

// Entry rule entryRuleFoodLineup
entryRuleFoodLineup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFoodLineupRule()); }
	iv_ruleFoodLineup=ruleFoodLineup
	{ $current=$iv_ruleFoodLineup.current; }
	EOF;

// Rule FoodLineup
ruleFoodLineup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='FOODLINEUP'
		{
			newLeafNode(otherlv_0, grammarAccess.getFoodLineupAccess().getFOODLINEUPKeyword_0());
		}
		otherlv_1='['
		{
			newLeafNode(otherlv_1, grammarAccess.getFoodLineupAccess().getLeftSquareBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFoodLineupAccess().getFoodlistFoodParserRuleCall_2_0());
				}
				lv_foodlist_2_0=ruleFood
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFoodLineupRule());
					}
					add(
						$current,
						"foodlist",
						lv_foodlist_2_0,
						"org.xtext.gmse.Domain.Food");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_3=']'
		{
			newLeafNode(otherlv_3, grammarAccess.getFoodLineupAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleFood
entryRuleFood returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFoodRule()); }
	iv_ruleFood=ruleFood
	{ $current=$iv_ruleFood.current; }
	EOF;

// Rule Food
ruleFood returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_STRING
				{
					newLeafNode(lv_name_0_0, grammarAccess.getFoodAccess().getNameSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFoodRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_1='Typ'
		{
			newLeafNode(otherlv_1, grammarAccess.getFoodAccess().getTypKeyword_1());
		}
		(
			(
				lv_type_2_0=RULE_STRING
				{
					newLeafNode(lv_type_2_0, grammarAccess.getFoodAccess().getTypeSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFoodRule());
					}
					setWithLastConsumed(
						$current,
						"type",
						lv_type_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_3='Ort'
		{
			newLeafNode(otherlv_3, grammarAccess.getFoodAccess().getOrtKeyword_3());
		}
		(
			(
				lv_place_4_0=RULE_STRING
				{
					newLeafNode(lv_place_4_0, grammarAccess.getFoodAccess().getPlaceSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFoodRule());
					}
					setWithLastConsumed(
						$current,
						"place",
						lv_place_4_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Rule days
ruledays returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Donnerstag'
			{
				$current = grammarAccess.getDaysAccess().getTHURSDAYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDaysAccess().getTHURSDAYEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Freitag'
			{
				$current = grammarAccess.getDaysAccess().getFRIDAYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDaysAccess().getFRIDAYEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='Samstag'
			{
				$current = grammarAccess.getDaysAccess().getSATURDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDaysAccess().getSATURDAYEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='Sonntag'
			{
				$current = grammarAccess.getDaysAccess().getSUNDAYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getDaysAccess().getSUNDAYEnumLiteralDeclaration_3());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
