/*
 * generated by Xtext 2.18.0
 */
package org.xtext.gmse.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DomainGrammarAccess extends AbstractGrammarElementFinder {
	
	public class FestivalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.gmse.Domain.Festival");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFESTIVALKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cVisitorsKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cVisitorsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVisitorsINTTerminalRuleCall_3_0 = (RuleCall)cVisitorsAssignment_3.eContents().get(0);
		private final Keyword cStartdateKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cStartdateAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cStartdateSTRINGTerminalRuleCall_5_0 = (RuleCall)cStartdateAssignment_5.eContents().get(0);
		private final Keyword cEnddateKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cEnddateAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cEnddateSTRINGTerminalRuleCall_7_0 = (RuleCall)cEnddateAssignment_7.eContents().get(0);
		private final Assignment cLineupAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cLineupLineupParserRuleCall_8_0 = (RuleCall)cLineupAssignment_8.eContents().get(0);
		private final Assignment cStagesAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cStagesStagelistParserRuleCall_9_0 = (RuleCall)cStagesAssignment_9.eContents().get(0);
		private final Assignment cTimetableAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final RuleCall cTimetableTimetableParserRuleCall_10_0 = (RuleCall)cTimetableAssignment_10.eContents().get(0);
		private final Assignment cFoodLineupAssignment_11 = (Assignment)cGroup.eContents().get(11);
		private final RuleCall cFoodLineupFoodLineupParserRuleCall_11_0 = (RuleCall)cFoodLineupAssignment_11.eContents().get(0);
		
		//Festival:
		//	'FESTIVAL' name=STRING
		//	'Visitors' visitors=INT
		//	'Startdate' startdate=STRING
		//	'Enddate' enddate=STRING
		//	lineup=Lineup
		//	stages=Stagelist
		//	timetable=Timetable
		//	foodLineup=FoodLineup?;
		@Override public ParserRule getRule() { return rule; }
		
		//'FESTIVAL' name=STRING 'Visitors' visitors=INT 'Startdate' startdate=STRING 'Enddate' enddate=STRING lineup=Lineup
		//stages=Stagelist timetable=Timetable foodLineup=FoodLineup?
		public Group getGroup() { return cGroup; }
		
		//'FESTIVAL'
		public Keyword getFESTIVALKeyword_0() { return cFESTIVALKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'Visitors'
		public Keyword getVisitorsKeyword_2() { return cVisitorsKeyword_2; }
		
		//visitors=INT
		public Assignment getVisitorsAssignment_3() { return cVisitorsAssignment_3; }
		
		//INT
		public RuleCall getVisitorsINTTerminalRuleCall_3_0() { return cVisitorsINTTerminalRuleCall_3_0; }
		
		//'Startdate'
		public Keyword getStartdateKeyword_4() { return cStartdateKeyword_4; }
		
		//startdate=STRING
		public Assignment getStartdateAssignment_5() { return cStartdateAssignment_5; }
		
		//STRING
		public RuleCall getStartdateSTRINGTerminalRuleCall_5_0() { return cStartdateSTRINGTerminalRuleCall_5_0; }
		
		//'Enddate'
		public Keyword getEnddateKeyword_6() { return cEnddateKeyword_6; }
		
		//enddate=STRING
		public Assignment getEnddateAssignment_7() { return cEnddateAssignment_7; }
		
		//STRING
		public RuleCall getEnddateSTRINGTerminalRuleCall_7_0() { return cEnddateSTRINGTerminalRuleCall_7_0; }
		
		//lineup=Lineup
		public Assignment getLineupAssignment_8() { return cLineupAssignment_8; }
		
		//Lineup
		public RuleCall getLineupLineupParserRuleCall_8_0() { return cLineupLineupParserRuleCall_8_0; }
		
		//stages=Stagelist
		public Assignment getStagesAssignment_9() { return cStagesAssignment_9; }
		
		//Stagelist
		public RuleCall getStagesStagelistParserRuleCall_9_0() { return cStagesStagelistParserRuleCall_9_0; }
		
		//timetable=Timetable
		public Assignment getTimetableAssignment_10() { return cTimetableAssignment_10; }
		
		//Timetable
		public RuleCall getTimetableTimetableParserRuleCall_10_0() { return cTimetableTimetableParserRuleCall_10_0; }
		
		//foodLineup=FoodLineup?
		public Assignment getFoodLineupAssignment_11() { return cFoodLineupAssignment_11; }
		
		//FoodLineup
		public RuleCall getFoodLineupFoodLineupParserRuleCall_11_0() { return cFoodLineupFoodLineupParserRuleCall_11_0; }
	}
	public class LineupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.gmse.Domain.Lineup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLINEUPKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cArtistsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cArtistsArtistParserRuleCall_2_0 = (RuleCall)cArtistsAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Lineup:
		//	'LINEUP' '[' artists+=Artist+ ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'LINEUP' '[' artists+=Artist+ ']'
		public Group getGroup() { return cGroup; }
		
		//'LINEUP'
		public Keyword getLINEUPKeyword_0() { return cLINEUPKeyword_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//artists+=Artist+
		public Assignment getArtistsAssignment_2() { return cArtistsAssignment_2; }
		
		//Artist
		public RuleCall getArtistsArtistParserRuleCall_2_0() { return cArtistsArtistParserRuleCall_2_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class ArtistElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.gmse.Domain.Artist");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameSTRINGTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cCountryKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cCountryAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCountrySTRINGTerminalRuleCall_2_0 = (RuleCall)cCountryAssignment_2.eContents().get(0);
		
		//Artist:
		//	name=STRING
		//	'country' country=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name=STRING 'country' country=STRING
		public Group getGroup() { return cGroup; }
		
		//name=STRING
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_0_0() { return cNameSTRINGTerminalRuleCall_0_0; }
		
		//'country'
		public Keyword getCountryKeyword_1() { return cCountryKeyword_1; }
		
		//country=STRING
		public Assignment getCountryAssignment_2() { return cCountryAssignment_2; }
		
		//STRING
		public RuleCall getCountrySTRINGTerminalRuleCall_2_0() { return cCountrySTRINGTerminalRuleCall_2_0; }
	}
	public class StagelistElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.gmse.Domain.Stagelist");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSTAGELISTKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStagesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStagesStageParserRuleCall_2_0 = (RuleCall)cStagesAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Stagelist:
		//	'STAGELIST' '[' stages+=Stage+ ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'STAGELIST' '[' stages+=Stage+ ']'
		public Group getGroup() { return cGroup; }
		
		//'STAGELIST'
		public Keyword getSTAGELISTKeyword_0() { return cSTAGELISTKeyword_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//stages+=Stage+
		public Assignment getStagesAssignment_2() { return cStagesAssignment_2; }
		
		//Stage
		public RuleCall getStagesStageParserRuleCall_2_0() { return cStagesStageParserRuleCall_2_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class StageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.gmse.Domain.Stage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cCapacityKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCapacityAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCapacityINTTerminalRuleCall_3_0 = (RuleCall)cCapacityAssignment_3.eContents().get(0);
		private final Keyword cTypeKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cInfoAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cInfoSTRINGTerminalRuleCall_5_0 = (RuleCall)cInfoAssignment_5.eContents().get(0);
		
		//Stage:
		//	'Stage' name=STRING
		//	'Capacity' capacity=INT
		//	'Type' info=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//'Stage' name=STRING 'Capacity' capacity=INT 'Type' info=STRING
		public Group getGroup() { return cGroup; }
		
		//'Stage'
		public Keyword getStageKeyword_0() { return cStageKeyword_0; }
		
		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
		
		//'Capacity'
		public Keyword getCapacityKeyword_2() { return cCapacityKeyword_2; }
		
		//capacity=INT
		public Assignment getCapacityAssignment_3() { return cCapacityAssignment_3; }
		
		//INT
		public RuleCall getCapacityINTTerminalRuleCall_3_0() { return cCapacityINTTerminalRuleCall_3_0; }
		
		//'Type'
		public Keyword getTypeKeyword_4() { return cTypeKeyword_4; }
		
		//info=STRING
		public Assignment getInfoAssignment_5() { return cInfoAssignment_5; }
		
		//STRING
		public RuleCall getInfoSTRINGTerminalRuleCall_5_0() { return cInfoSTRINGTerminalRuleCall_5_0; }
	}
	public class TimetableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.gmse.Domain.Timetable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTIMETABLEKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTimetableAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTimetableTimetableEntryParserRuleCall_2_0 = (RuleCall)cTimetableAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Timetable:
		//	'TIMETABLE' '[' timetable+=TimetableEntry+ ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'TIMETABLE' '[' timetable+=TimetableEntry+ ']'
		public Group getGroup() { return cGroup; }
		
		//'TIMETABLE'
		public Keyword getTIMETABLEKeyword_0() { return cTIMETABLEKeyword_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//timetable+=TimetableEntry+
		public Assignment getTimetableAssignment_2() { return cTimetableAssignment_2; }
		
		//TimetableEntry
		public RuleCall getTimetableTimetableEntryParserRuleCall_2_0() { return cTimetableTimetableEntryParserRuleCall_2_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class TimetableEntryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.gmse.Domain.TimetableEntry");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cArtistKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cNameArtistCrossReference_1_0 = (CrossReference)cNameAssignment_1.eContents().get(0);
		private final RuleCall cNameArtistSTRINGTerminalRuleCall_1_0_1 = (RuleCall)cNameArtistCrossReference_1_0.eContents().get(1);
		private final Keyword cDayKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDayAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cDayDaysEnumRuleCall_3_0 = (RuleCall)cDayAssignment_3.eContents().get(0);
		private final Keyword cTimeslotKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTimeAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTimeSTRINGTerminalRuleCall_5_0 = (RuleCall)cTimeAssignment_5.eContents().get(0);
		private final Keyword cStageKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cStageAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final CrossReference cStageStageCrossReference_7_0 = (CrossReference)cStageAssignment_7.eContents().get(0);
		private final RuleCall cStageStageSTRINGTerminalRuleCall_7_0_1 = (RuleCall)cStageStageCrossReference_7_0.eContents().get(1);
		
		//TimetableEntry:
		//	'Artist' name=[Artist|STRING]
		//	'Day' day=days
		//	'Timeslot' time=STRING
		//	'Stage' stage=[Stage|STRING];
		@Override public ParserRule getRule() { return rule; }
		
		//'Artist' name=[Artist|STRING] 'Day' day=days 'Timeslot' time=STRING 'Stage' stage=[Stage|STRING]
		public Group getGroup() { return cGroup; }
		
		//'Artist'
		public Keyword getArtistKeyword_0() { return cArtistKeyword_0; }
		
		//name=[Artist|STRING]
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//[Artist|STRING]
		public CrossReference getNameArtistCrossReference_1_0() { return cNameArtistCrossReference_1_0; }
		
		//STRING
		public RuleCall getNameArtistSTRINGTerminalRuleCall_1_0_1() { return cNameArtistSTRINGTerminalRuleCall_1_0_1; }
		
		//'Day'
		public Keyword getDayKeyword_2() { return cDayKeyword_2; }
		
		//day=days
		public Assignment getDayAssignment_3() { return cDayAssignment_3; }
		
		//days
		public RuleCall getDayDaysEnumRuleCall_3_0() { return cDayDaysEnumRuleCall_3_0; }
		
		//'Timeslot'
		public Keyword getTimeslotKeyword_4() { return cTimeslotKeyword_4; }
		
		//time=STRING
		public Assignment getTimeAssignment_5() { return cTimeAssignment_5; }
		
		//STRING
		public RuleCall getTimeSTRINGTerminalRuleCall_5_0() { return cTimeSTRINGTerminalRuleCall_5_0; }
		
		//'Stage'
		public Keyword getStageKeyword_6() { return cStageKeyword_6; }
		
		//stage=[Stage|STRING]
		public Assignment getStageAssignment_7() { return cStageAssignment_7; }
		
		//[Stage|STRING]
		public CrossReference getStageStageCrossReference_7_0() { return cStageStageCrossReference_7_0; }
		
		//STRING
		public RuleCall getStageStageSTRINGTerminalRuleCall_7_0_1() { return cStageStageSTRINGTerminalRuleCall_7_0_1; }
	}
	public class FoodLineupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.gmse.Domain.FoodLineup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFOODLINEUPKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cFoodlistAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFoodlistFoodParserRuleCall_2_0 = (RuleCall)cFoodlistAssignment_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FoodLineup:
		//	'FOODLINEUP' '[' foodlist+=Food+ ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'FOODLINEUP' '[' foodlist+=Food+ ']'
		public Group getGroup() { return cGroup; }
		
		//'FOODLINEUP'
		public Keyword getFOODLINEUPKeyword_0() { return cFOODLINEUPKeyword_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1() { return cLeftSquareBracketKeyword_1; }
		
		//foodlist+=Food+
		public Assignment getFoodlistAssignment_2() { return cFoodlistAssignment_2; }
		
		//Food
		public RuleCall getFoodlistFoodParserRuleCall_2_0() { return cFoodlistFoodParserRuleCall_2_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3() { return cRightSquareBracketKeyword_3; }
	}
	public class FoodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.gmse.Domain.Food");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameSTRINGTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cTypKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeSTRINGTerminalRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Keyword cOrtKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPlaceAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cPlaceSTRINGTerminalRuleCall_4_0 = (RuleCall)cPlaceAssignment_4.eContents().get(0);
		
		//Food:
		//	name=STRING
		//	'Typ' type=STRING
		//	'Ort' place=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name=STRING 'Typ' type=STRING 'Ort' place=STRING
		public Group getGroup() { return cGroup; }
		
		//name=STRING
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_0_0() { return cNameSTRINGTerminalRuleCall_0_0; }
		
		//'Typ'
		public Keyword getTypKeyword_1() { return cTypKeyword_1; }
		
		//type=STRING
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//STRING
		public RuleCall getTypeSTRINGTerminalRuleCall_2_0() { return cTypeSTRINGTerminalRuleCall_2_0; }
		
		//'Ort'
		public Keyword getOrtKeyword_3() { return cOrtKeyword_3; }
		
		//place=STRING
		public Assignment getPlaceAssignment_4() { return cPlaceAssignment_4; }
		
		//STRING
		public RuleCall getPlaceSTRINGTerminalRuleCall_4_0() { return cPlaceSTRINGTerminalRuleCall_4_0; }
	}
	
	public class DaysElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.gmse.Domain.days");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cTHURSDAYEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cTHURSDAYDonnerstagKeyword_0_0 = (Keyword)cTHURSDAYEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cFRIDAYEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cFRIDAYFreitagKeyword_1_0 = (Keyword)cFRIDAYEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSATURDAYEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSATURDAYSamstagKeyword_2_0 = (Keyword)cSATURDAYEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cSUNDAYEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cSUNDAYSonntagKeyword_3_0 = (Keyword)cSUNDAYEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum days:
		//	THURSDAY="Donnerstag" |
		//	FRIDAY="Freitag" |
		//	SATURDAY="Samstag" |
		//	SUNDAY="Sonntag";
		public EnumRule getRule() { return rule; }
		
		//THURSDAY="Donnerstag" | FRIDAY="Freitag" | SATURDAY="Samstag" | SUNDAY="Sonntag"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//THURSDAY="Donnerstag"
		public EnumLiteralDeclaration getTHURSDAYEnumLiteralDeclaration_0() { return cTHURSDAYEnumLiteralDeclaration_0; }
		
		//"Donnerstag"
		public Keyword getTHURSDAYDonnerstagKeyword_0_0() { return cTHURSDAYDonnerstagKeyword_0_0; }
		
		//FRIDAY="Freitag"
		public EnumLiteralDeclaration getFRIDAYEnumLiteralDeclaration_1() { return cFRIDAYEnumLiteralDeclaration_1; }
		
		//"Freitag"
		public Keyword getFRIDAYFreitagKeyword_1_0() { return cFRIDAYFreitagKeyword_1_0; }
		
		//SATURDAY="Samstag"
		public EnumLiteralDeclaration getSATURDAYEnumLiteralDeclaration_2() { return cSATURDAYEnumLiteralDeclaration_2; }
		
		//"Samstag"
		public Keyword getSATURDAYSamstagKeyword_2_0() { return cSATURDAYSamstagKeyword_2_0; }
		
		//SUNDAY="Sonntag"
		public EnumLiteralDeclaration getSUNDAYEnumLiteralDeclaration_3() { return cSUNDAYEnumLiteralDeclaration_3; }
		
		//"Sonntag"
		public Keyword getSUNDAYSonntagKeyword_3_0() { return cSUNDAYSonntagKeyword_3_0; }
	}
	
	private final FestivalElements pFestival;
	private final LineupElements pLineup;
	private final ArtistElements pArtist;
	private final StagelistElements pStagelist;
	private final StageElements pStage;
	private final TimetableElements pTimetable;
	private final TimetableEntryElements pTimetableEntry;
	private final DaysElements eDays;
	private final FoodLineupElements pFoodLineup;
	private final FoodElements pFood;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DomainGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFestival = new FestivalElements();
		this.pLineup = new LineupElements();
		this.pArtist = new ArtistElements();
		this.pStagelist = new StagelistElements();
		this.pStage = new StageElements();
		this.pTimetable = new TimetableElements();
		this.pTimetableEntry = new TimetableEntryElements();
		this.eDays = new DaysElements();
		this.pFoodLineup = new FoodLineupElements();
		this.pFood = new FoodElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.gmse.Domain".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Festival:
	//	'FESTIVAL' name=STRING
	//	'Visitors' visitors=INT
	//	'Startdate' startdate=STRING
	//	'Enddate' enddate=STRING
	//	lineup=Lineup
	//	stages=Stagelist
	//	timetable=Timetable
	//	foodLineup=FoodLineup?;
	public FestivalElements getFestivalAccess() {
		return pFestival;
	}
	
	public ParserRule getFestivalRule() {
		return getFestivalAccess().getRule();
	}
	
	//Lineup:
	//	'LINEUP' '[' artists+=Artist+ ']';
	public LineupElements getLineupAccess() {
		return pLineup;
	}
	
	public ParserRule getLineupRule() {
		return getLineupAccess().getRule();
	}
	
	//Artist:
	//	name=STRING
	//	'country' country=STRING;
	public ArtistElements getArtistAccess() {
		return pArtist;
	}
	
	public ParserRule getArtistRule() {
		return getArtistAccess().getRule();
	}
	
	//Stagelist:
	//	'STAGELIST' '[' stages+=Stage+ ']';
	public StagelistElements getStagelistAccess() {
		return pStagelist;
	}
	
	public ParserRule getStagelistRule() {
		return getStagelistAccess().getRule();
	}
	
	//Stage:
	//	'Stage' name=STRING
	//	'Capacity' capacity=INT
	//	'Type' info=STRING;
	public StageElements getStageAccess() {
		return pStage;
	}
	
	public ParserRule getStageRule() {
		return getStageAccess().getRule();
	}
	
	//Timetable:
	//	'TIMETABLE' '[' timetable+=TimetableEntry+ ']';
	public TimetableElements getTimetableAccess() {
		return pTimetable;
	}
	
	public ParserRule getTimetableRule() {
		return getTimetableAccess().getRule();
	}
	
	//TimetableEntry:
	//	'Artist' name=[Artist|STRING]
	//	'Day' day=days
	//	'Timeslot' time=STRING
	//	'Stage' stage=[Stage|STRING];
	public TimetableEntryElements getTimetableEntryAccess() {
		return pTimetableEntry;
	}
	
	public ParserRule getTimetableEntryRule() {
		return getTimetableEntryAccess().getRule();
	}
	
	//enum days:
	//	THURSDAY="Donnerstag" |
	//	FRIDAY="Freitag" |
	//	SATURDAY="Samstag" |
	//	SUNDAY="Sonntag";
	public DaysElements getDaysAccess() {
		return eDays;
	}
	
	public EnumRule getDaysRule() {
		return getDaysAccess().getRule();
	}
	
	//FoodLineup:
	//	'FOODLINEUP' '[' foodlist+=Food+ ']';
	public FoodLineupElements getFoodLineupAccess() {
		return pFoodLineup;
	}
	
	public ParserRule getFoodLineupRule() {
		return getFoodLineupAccess().getRule();
	}
	
	//Food:
	//	name=STRING
	//	'Typ' type=STRING
	//	'Ort' place=STRING;
	public FoodElements getFoodAccess() {
		return pFood;
	}
	
	public ParserRule getFoodRule() {
		return getFoodAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
