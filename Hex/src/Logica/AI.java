package Logica;

import java.lang.reflect.InvocationTargetException;

import it.unical.mat.embasp.base.Handler;
import it.unical.mat.embasp.base.InputProgram;
import it.unical.mat.embasp.base.Output;
import it.unical.mat.embasp.languages.asp.ASPInputProgram;
import it.unical.mat.embasp.languages.asp.ASPMapper;
import it.unical.mat.embasp.languages.asp.AnswerSet;
import it.unical.mat.embasp.languages.asp.AnswerSets;
import it.unical.mat.embasp.platforms.desktop.DesktopHandler;
import it.unical.mat.embasp.specializations.dlv2.desktop.DLV2DesktopService;

public class AI {
	
	private String encodingResource = "encodings/hex";
	private Handler handler;
	private Output output;
	private AnswerSets answers;
	private InputProgram program;
	private InputProgram facts;
	
	private redWon redWon;
	private blueWon blueWon;

	public AI()
	{
		handler = new DesktopHandler(new DLV2DesktopService("lib/dlv2"));
		
		facts = new ASPInputProgram();
		
		program = new ASPInputProgram();
		program.addFilesPath(encodingResource);
		handler.addProgram(program);
		
		try {
			
			ASPMapper.getInstance().registerClass(Hexagon.class);
			ASPMapper.getInstance().registerClass(Click.class);
			ASPMapper.getInstance().registerClass(redWon.class);
			ASPMapper.getInstance().registerClass(blueWon.class);
	
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		redWon = null;
		blueWon = null;
	}
	
	public void newFacts(Hexagon h) throws Exception
	{
		facts.addObjectInput(new Hexagon(h));
	}
	
	public String AI_Move() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException 
	{
		handler.addProgram(facts);
		
		Click hex = new Click();
		redWon = new redWon();
		blueWon = new blueWon();
		
		output = handler.startSync();
		
		answers = (AnswerSets) output;
		
		for(AnswerSet a: answers.getAnswersets())
			for(Object obj: a.getAtoms())
			{
				if(obj instanceof Click)
					hex = (Click) obj;
				
				if(obj instanceof redWon)
					redWon = (redWon) obj;
				
				if(obj instanceof blueWon)
					blueWon = (blueWon) obj;
			}
		
		handler.removeProgram(facts);
		facts.clearAll();

		return hex.getValue();
	}
	
	public String verificaVincitore() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, InstantiationException
	{
		handler.addProgram(facts);
		
		redWon = new redWon();
		blueWon = new blueWon();
		
		output = handler.startSync();
		
		answers = (AnswerSets) output;
		
		for(AnswerSet a: answers.getAnswersets())
			for(Object obj: a.getAtoms())
			{
				if(obj instanceof redWon)
					redWon = (redWon) obj;
				
				if(obj instanceof blueWon)
					blueWon = (blueWon) obj;
			}
		
		handler.removeProgram(facts);
		
		String vincitore = null;
		
		if(!redWon.empty() && blueWon.empty())
			vincitore = new String("ROSSO");
		
		else if(redWon.empty() && !blueWon.empty())
			vincitore = new String("BLU");
		
		else if(!redWon.empty() && !blueWon.empty())
			vincitore = new String("pareggio IMPOSSIBILE");
		
		return vincitore;
	}
	
	public void clearFacts()
	{
		facts.clearAll();
	}
	
	public String getEncodingResource() {
		return encodingResource;
	}

	public void setEncodingResource(String encodingResource) {
		this.encodingResource = encodingResource;
	}

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Output getOutput() {
		return output;
	}

	public void setOutput(Output output) {
		this.output = output;
	}

	public AnswerSets getAnswers() {
		return answers;
	}

	public void setAnswers(AnswerSets answers) {
		this.answers = answers;
	}

	public InputProgram getProgram() {
		return program;
	}

	public void setProgram(InputProgram program) {
		this.program = program;
	}
	
	public void stampaFatti()
	{
		//System.out.println(facts.getPrograms());
		System.out.println(answers.getOutput());
	}
}
