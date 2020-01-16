/*
Copyright (C) NAVER corp.  

This library is free software; you can redistribute it and/or  
modify it under the terms of the GNU Lesser General Public  
License as published by the Free Software Foundation; either  
version 2.1 of the License, or (at your option) any later version.  

This library is distributed in the hope that it will be useful,  
but WITHOUT ANY WARRANTY; without even the implied warranty of  
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU  
Lesser General Public License for more details.  

You should have received a copy of the GNU Lesser General Public  
License along with this library; if not, write to the Free Software  
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA   
*/
window.createSEditor2 = function(elIRField, htParams, elSeAppContainer){
	if(!window.$Jindo){
		parent.document.body.innerHTML="吏��� ���������� �����⑸����.<br>\n<a href='http://dev.naver.com/projects/jindo/download'>http://dev.naver.com/projects/jindo/download</a>���� Jindo 1.5.3 踰����� jindo.min.js瑜� �ㅼ�대��� 諛��� /js �대���� 蹂듭�� �� 二쇱�몄��.\n(��吏� Jindo 2 �� 吏�����吏� ���듬����.)";
		return;
	}
	
	var elAppContainer = (elSeAppContainer || jindo.$("smart_editor2"));	
	var elEditingArea = jindo.$$.getSingle("DIV.husky_seditor_editing_area_container", elAppContainer);
	var oWYSIWYGIFrame = jindo.$$.getSingle("IFRAME.se2_input_wysiwyg", elEditingArea);
	var oIRTextarea = elIRField?elIRField:jindo.$$.getSingle("TEXTAREA.blind", elEditingArea);
	var oHTMLSrc = jindo.$$.getSingle("TEXTAREA.se2_input_htmlsrc", elEditingArea);
	var oTextArea = jindo.$$.getSingle("TEXTAREA.se2_input_text", elEditingArea);
	
	if(!htParams){ 
		htParams = {}; 
		htParams.fOnBeforeUnload = null;
	}
	htParams.elAppContainer = elAppContainer;												// ������ UI 理����� element ���� 
	htParams.oNavigator = jindo.$Agent().navigator();										// navigator 媛�泥� ����
	htParams.I18N_LOCALE = htParams.I18N_LOCALE || "ko_KR";

	var oEditor = new nhn.husky.HuskyCore(htParams);
	oEditor.registerPlugin(new nhn.husky.CorePlugin(htParams?htParams.fOnAppLoad:null));	
	oEditor.registerPlugin(new nhn.husky.StringConverterManager());
	if(htParams.bSkipXssFilter !== true){
		// 蹂댁�� ���곕� ���ш렇�� (TODO:���ㅻ�由� 諛� 釉���由ъ�ㅽ�� �듭�� 異�媛�)
		oEditor.registerPlugin({
			_rxFilter:/<\/*(?:applet|b(?:ase|gsound|link)|embed|frame(?:set)?|i(?:frame|layer)|l(?:ayer|ink)|meta|object|s(?:cript|tyle)|title|xml)[^>]*?>/gi,
			$ON_REGISTER_CONVERTERS : function() {
				var fXssFilter = jindo.$Fn(function(sHtml){
					return sHtml.replace(this._rxFilter, "");
				}, this).bind();
				this.oApp.exec("ADD_CONVERTER",["HTMLSrc_TO_IR", fXssFilter]);
				this.oApp.exec("ADD_CONVERTER",["IR_TO_DB", fXssFilter]);
			}
		});
	}

	var htDimension = {
		nMinHeight:205,
		nMinWidth:parseInt(elIRField.style.minWidth, 10)||570,
		nHeight:elIRField.style.height||elIRField.offsetHeight,
		nWidth:elIRField.style.width||elIRField.offsetWidth
	};
	
	var htConversionMode = {
		bUseVerticalResizer : htParams.bUseVerticalResizer,
		bUseModeChanger : htParams.bUseModeChanger
	};
	
	var aAdditionalFontList = htParams.aAdditionalFontList;
	
	oEditor.registerPlugin(new nhn.husky.SE_EditingAreaManager("WYSIWYG", oIRTextarea, htDimension,  htParams.fOnBeforeUnload, elAppContainer));
	oEditor.registerPlugin(new nhn.husky.SE_EditingArea_WYSIWYG(oWYSIWYGIFrame));			// Tab Editor 紐⑤��
	oEditor.registerPlugin(new nhn.husky.SE_EditingArea_HTMLSrc(oHTMLSrc));					// Tab HTML 紐⑤��
	oEditor.registerPlugin(new nhn.husky.SE_EditingArea_TEXT(oTextArea));					// Tab Text 紐⑤��
	oEditor.registerPlugin(new nhn.husky.SE2M_EditingModeChanger(elAppContainer, htConversionMode));	// 紐⑤��媛� 蹂�寃�(Editor, HTML, Text)
	oEditor.registerPlugin(new nhn.husky.SE_PasteHandler()); 								// WYSIWYG Paste Handler
	
	oEditor.registerPlugin(new nhn.husky.HuskyRangeManager(oWYSIWYGIFrame));
	oEditor.registerPlugin(new nhn.husky.Utils());
	oEditor.registerPlugin(new nhn.husky.SE2M_UtilPlugin());
	oEditor.registerPlugin(new nhn.husky.SE_WYSIWYGStyler());
	oEditor.registerPlugin(new nhn.husky.SE2M_Toolbar(elAppContainer));
	
	oEditor.registerPlugin(new nhn.husky.Hotkey());											// �⑥���
	oEditor.registerPlugin(new nhn.husky.SE_EditingAreaVerticalResizer(elAppContainer, htConversionMode));	// �몄����� 由ъ�ъ�댁�
	oEditor.registerPlugin(new nhn.husky.DialogLayerManager());
	oEditor.registerPlugin(new nhn.husky.ActiveLayerManager());
	oEditor.registerPlugin(new nhn.husky.SE_WYSIWYGStyleGetter());							// 而ㅼ�� ��移� �ㅽ���� ��蹂� 媛��몄�ㅺ린

	oEditor.registerPlugin(new nhn.husky.SE_WYSIWYGEnterKey("P"));							// ���� �� 泥�由�, ���щ�� P濡� 泥�由�
	
	oEditor.registerPlugin(new nhn.husky.SE2M_ColorPalette(elAppContainer));				// ���� ������
	oEditor.registerPlugin(new nhn.husky.SE2M_FontColor(elAppContainer));					// 湲�����
	oEditor.registerPlugin(new nhn.husky.SE2M_BGColor(elAppContainer));						// 湲���諛곌꼍��
	oEditor.registerPlugin(new nhn.husky.SE2M_FontNameWithLayerUI(elAppContainer, aAdditionalFontList));	// 湲�瑗댁�瑜�
	oEditor.registerPlugin(new nhn.husky.SE2M_FontSizeWithLayerUI(elAppContainer));			// 湲�瑗댄�ш린
	
	oEditor.registerPlugin(new nhn.husky.SE2M_LineStyler());								 
	oEditor.registerPlugin(new nhn.husky.SE2M_ExecCommand(oWYSIWYGIFrame));
	oEditor.registerPlugin(new nhn.husky.SE2M_LineHeightWithLayerUI(elAppContainer));		// 以�媛�寃�	

	oEditor.registerPlugin(new nhn.husky.SE2M_Quote(elAppContainer));						// �몄�⑷뎄
	oEditor.registerPlugin(new nhn.husky.SE2M_Hyperlink(elAppContainer));					// 留���
	oEditor.registerPlugin(new nhn.husky.SE2M_SCharacter(elAppContainer));					// �뱀��臾몄��
	oEditor.registerPlugin(new nhn.husky.SE2M_FindReplacePlugin(elAppContainer));			// 李얘린/諛�袁멸린
	oEditor.registerPlugin(new nhn.husky.SE2M_TableCreator(elAppContainer));				// ���대� ����
	oEditor.registerPlugin(new nhn.husky.SE2M_TableEditor(elAppContainer));					// ���대� �몄�
	oEditor.registerPlugin(new nhn.husky.SE2M_TableBlockStyler(elAppContainer));			// ���대� �ㅽ����
	if(nhn.husky.SE2M_AttachQuickPhoto){
		oEditor.registerPlugin(new nhn.husky.SE2M_AttachQuickPhoto(elAppContainer));			// �ъ�			
	}

	oEditor.registerPlugin(new nhn.husky.MessageManager(oMessageMap, htParams.I18N_LOCALE));
	oEditor.registerPlugin(new nhn.husky.SE2M_QuickEditor_Common(elAppContainer));			// �듭������ 怨듯��(��, �대�몄�)
	
	oEditor.registerPlugin(new nhn.husky.SE2B_CSSLoader());									// CSS lazy load
	if(window.frameElement){
		oEditor.registerPlugin(new nhn.husky.SE_OuterIFrameControl(elAppContainer, 100));
	}
	
	oEditor.registerPlugin(new nhn.husky.SE_ToolbarToggler(elAppContainer, htParams.bUseToolbar));
	oEditor.registerPlugin(new nhn.husky.SE2M_Accessibility(elAppContainer, htParams.I18N_LOCALE));	// �����곕�댁�� �뱀��洹쇱�� 愿��� 湲곕�λえ�� ���ш렇�� 
	oEditor.registerPlugin(new nhn.husky.SE2M_AttachQuickPhoto(elAppContainer));
	return oEditor;
};