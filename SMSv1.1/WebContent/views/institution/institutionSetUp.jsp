<%@ include file="../common/header.jsp"%>

<!-- page content -->
<div class="right_col" role="main">
	<div class="clearfix"></div>
	<div class="row">
		<div class="col-md-12 col-sm-12 col-xs-12">
			<div class="x_panel">
				<div class="x_title">
					<h2>
						Institution Setup <small></small>
					</h2>
					<ul class="nav navbar-right panel_toolbox">
						<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
						</li>
						<li><a class="close-link"><i class="fa fa-close"></i></a></li>
					</ul>
					<div class="clearfix"></div>
				</div>
				<div class="x_content">
					<p>
						Fields with
						<code>*</code>
						are required.
					</p>
					<spring:url value="/saveInstitution" var="saveInstitutionUrl" />
					<form:form role="form" method="post"
						modelAttribute="institutionForm" action="${saveInstitutionUrl}"
						class="form-horizontal form-label-left">

						<!-- Smart Wizard -->
						<div id="wizard" class="form_wizard wizard_horizontal">
							<ul class="wizard_steps">
								<li><a href="#step-1"> <span class="step_no">1</span> <span
										class="step_descr"> Step 1<br /> <small>Institution's
												Information</small>
									</span>
								</a></li>
								<li><a href="#step-2"> <span class="step_no">2</span> <span
										class="step_descr"> Step 2<br /> <small>Institution's
												Contacts</small>
									</span>
								</a></li>
								<li><a href="#step-3"> <span class="step_no">3</span> <span
										class="step_descr"> Step 3<br /> <small>Head
												of the Institution's Information</small>
									</span>
								</a></li>
								<li><a href="#step-4"> <span class="step_no">4</span> <span
										class="step_descr"> Step 4<br /> <small>Institution's
												Settings</small>
									</span>
								</a></li>
							</ul>

							<div id="step-1">
								<span class="section">Institution's Information</span>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="name">Institution's Name <span class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12 has-feedback">
										<form:input path="institutionName" type="text"
											class="form-control col-sm-7 col-sm-12 has-feedback-left"
											maxlength="255" placeholder="Please enter Institution's Name"
											required="required" />
										<span class="fa fa-institution form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="name">Founded On<span class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12">
										<form:input path="insDateOfInception" type="text"
											class="form-control has-feedback-left"
											placeholder="Please enter a Date"
											aria-describedby="inputSuccess2Status"
											data-inputmask="'mask': '99/99/9999'" required="required" />
										<span class="fa fa-calendar-o form-control-feedback left"
											aria-hidden="true"></span> <span id="inputSuccess2Status"
											class="sr-only">(success)</span>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="name">Address<span class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12 has-feedback">
										<form:input path="insAddressLine1"
											class="form-control col-md-7 col-xs-12 has-feedback-left"
											maxlength="255" name="address"
											placeholder="Please enter Address" required="required"
											type="text" />
										<span class="fa fa-pencil-square-o form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="name">Country<span class="required">*</span></label>
									<div class="col-md-2 col-sm-2 col-xs-12" style="width: 590px;">
										<form:select path="insCountry"
											class="select2_single form-control" tabindex="-1"
											required="required" style="width: 590px;">
											<option></option>
											<option value="India">India</option>
											<option value="USA">USA</option>
										</form:select>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="name">State<span class="required">*</span></label>
									<div class="col-md-2 col-sm-2 col-xs-12" style="width: 590px;">
										<form:select path="insState"
											class="select2_single form-control" tabindex="-1"
											required="required" style="width: 590px;">
											<option></option>
											<option value="West Bengal">West Bengal</option>
											<option value="Karnataka">Karnataka</option>
										</form:select>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="name">City<span class="required">*</span></label>
									<div class="col-md-2 col-sm-2 col-xs-12" style="width: 590px;">
										<form:select path="insCity"
											class="select2_single form-control" tabindex="-1"
											required="required" style="width: 590px;">
											<option></option>
											<option value="Bangalore">Bangalore</option>
											<option value="Kolkata">Kolkata</option>
										</form:select>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="number">Pincode <span class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12  has-feedback">
										<form:input path="insPinCode" type="number"
											required="required" data-validate-length-range="2,10"
											placeholder="Please enter Pincode"
											class="form-control col-md-7 col-xs-12  has-feedback-left" />
										<span class="fa fa-pencil-square-o form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="name">Institution's Registration Code <span
										class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12  has-feedback">
										<form:input path="institutionRegistraionCode"
											class="form-control col-sm-7 col-sm-12 has-feedback-left"
											maxlength="255"
											placeholder="Please enter Institution's Registration Code"
											required="required" type="text" />
										<span class="fa fa-pencil-square-o form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
							</div>
							<div id="step-2">
								<span class="section">Institution's Contacts</span>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="telephone">Phone <span class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12 has-feedback">
										<form:input path="insPhone" type="tel" required="required"
											data-validate-length-range="8,20"
											placeholder="Please enter contact no."
											class="form-control col-md-7 col-xs-12 has-feedback-left" />
										<span class="fa fa-phone form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="telephone">Alternate Phone </label>
									<div class="col-md-6 col-sm-6 col-xs-12 has-feedback">
										<form:input path="insAltPhone" type="number"
											data-validate-length-range="8,20"
											placeholder="Please enter alternative contact no."
											class="form-control col-md-7 col-xs-12 has-feedback-left" />
										<span class="fa fa-phone form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="email">Email <span class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12 has-feedback">
										<form:input path="insEmail" type="email"
											placeholder="Please enter email" required="required"
											class="form-control col-md-7 col-xs-12 has-feedback-left" />
										<span class="fa fa-envelope form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="email">Confirm Email <span class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12 has-feedback">
										<input type="email" id="email2" name="confirm_email"
											data-validate-linked="insEmail" required="required"
											placeholder="Confirm your email"
											class="form-control col-md-7 col-xs-12 has-feedback-left">
										<span class="fa fa-envelope form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="number">Fax </label>
									<div class="col-md-6 col-sm-6 col-xs-12 has-feedback">
										<form:input path="insFax" type="number"
											placeholder="Please enter Fax"
											class="form-control col-md-7 col-xs-12 has-feedback-left" />
										<span class="fa fa-fax form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="website">Institute Website URL <span
										class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12 has-feedback">
										<form:input path="insWebsiteUrl" type="url"
											required="required" placeholder="Enter the URL"
											class="form-control col-md-7 col-xs-12 has-feedback-left" />
										<span class="fa fa-pencil-square-o form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
							</div>
							<div id="step-3">
								<span class="section">Head of the Institution's
									Information</span>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="name">Name of the Principal/Head<span
										class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12 has-feedback">
										<form:input path="insHeadName"
											class="form-control col-sm-7 col-sm-12 has-feedback-left"
											maxlength="255"
											placeholder="Please enter name of the Principal/Head"
											required="required" type="text" />
										<span class="fa fa-user form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="email">Email of the Principal/Head<span
										class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12 has-feedback">
										<form:input path="insHeadEmailId" type="email"
											placeholder="Please enter email of the Principal/Head"
											required="required"
											class="form-control col-md-7 col-xs-12 has-feedback-left" />
										<span class="fa fa-envelope form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="telephone">Office no of Principal/Head <span
										class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12 has-feedback">
										<form:input path="insHeadOfficeNo" type="tel"
											required="required" data-validate-length-range="8,20"
											placeholder="Please enter the office no of Principal/Head"
											class="form-control col-md-7 col-xs-12 has-feedback-left" />
										<span class="fa fa-phone form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="telephone">Personal no of Principal/Head </label>
									<div class="col-md-6 col-sm-6 col-xs-12 has-feedback">
										<form:input path="insHeadPersonalNo" type="number"
											data-validate-length-range="8,20"
											placeholder="Please enter personal no of Principal/Head"
											class="form-control col-md-7 col-xs-12 has-feedback-left" />
										<span class="fa fa-mobile form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
							</div>
							<div id="step-4">
								<span class="section">Institution's Settings</span>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="telephone">Institution Type</label>
									<div class="radio">
										<label> <form:radiobutton path="insType"
												value="primary" /> Primary
										</label> <label> <form:radiobutton path="insType"
												value="secondary" /> Secondary
										</label> <label> <form:radiobutton path="insType"
												value="Higher secondary" /> Higher Secondary
										</label> <label> <form:radiobutton path="insType"
												value="Education Trust" /> Education Trust
										</label> <label> <form:radiobutton path="insType"
												value="Education Society" /> Education Society
										</label>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="telephone">Parent Institution</label>
									<div class="col-md-6 col-sm-6 col-xs-12">
										<form:select path="insParentName"
											class="select2_single form-control" tabindex="-1"
											required="required" style="width: 590px;">
											<option></option>
											<option value="Vivekananda Trust">Vivekananda Trust</option>
											<option value="SaiBaba Trust">SaiBaba Trust</option>
										</form:select>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12">Medium
										Of Education</label>
									<div class="col-md-6 col-sm-6 col-xs-12">
										<form:select path="insMediumOfEducation"
											class="select2_multiple form-control" multiple="multiple"
											style="width: 590px;" required="required">
											<option value="English Medium">English Medium</option>
											<option value="Tamil Medium">Tamil Medium</option>
											<option value="Telegu Medium">Telegu Medium</option>
											<option value="Kannada Medium">Kannada Medium</option>
											<option value="Bengali Medium">Bengali Medium</option>
										</form:select>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="telephone">School Board</label>
									<div class="col-md-6 col-sm-6 col-xs-12">
										<form:select path="insBoard"
											class="select2_single form-control" tabindex="-1"
											style="width: 590px;" required="required">
											<option></option>
											<option
												value="Board of Higher Secondary Education
												Delhi">Board
												of Higher Secondary Education Delhi</option>
											<option
												value="Andhra Pradesh Board of Secondary
												Education">Andhra
												Pradesh Board of Secondary Education</option>
											<option value="Andhra Pradesh open School society">Andhra
												Pradesh open School society</option>
										</form:select>
									</div>
								</div>
								<div class="item form-group">
									<label class="control-label col-md-3 col-sm-3 col-xs-12"
										for="name">Institution's Examination Code <span
										class="required">*</span>
									</label>
									<div class="col-md-6 col-sm-6 col-xs-12  has-feedback">
										<form:input path="insExaminationCode"
											class="form-control col-sm-7 col-sm-12  has-feedback-left"
											maxlength="255"
											placeholder="Please enter Institution's Examination Code"
											required="required" type="text" />
										<span class="fa fa-pencil-square-o form-control-feedback left"
											aria-hidden="true"></span>
									</div>
								</div>
							</div>
						</div>
						<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
					</form:form>
				</div>
			</div>
		</div>
	</div>

</div>

<!-- modal start on click of finish button click -->
<div class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog"
	aria-hidden="true" id="instituteModalId">
	<div class="modal-dialog modal-lg">
		<div class="modal-content">

			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">×</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">Institution Setup</h4>
			</div>
			<div class="modal-body">
				<div class="" role="tabpanel" data-example-id="togglable-tabs">
					<ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
						<li role="presentation" class="active"><a
							href="#tab_content1" id="insinfo-tab" role="tab"
							data-toggle="tab" aria-expanded="true">Institution's
								Information</a></li>
						<li role="presentation" class=""><a href="#tab_content2"
							role="tab" id="inscontact-tab" data-toggle="tab"
							aria-expanded="false">Institution's Contacts</a></li>
						<li role="presentation" class=""><a href="#tab_content3"
							role="tab" id="insheadinfo-tab" data-toggle="tab"
							aria-expanded="false">Head's Information</a></li>
						<li role="presentation" class=""><a href="#tab_content4"
							role="tab" id="inssetting-tab" data-toggle="tab"
							aria-expanded="false">Institution's Settings</a></li>
					</ul>
					<div id="myTabContent" class="tab-content">
						<div role="tabpanel" class="tab-pane fade active in"
							id="tab_content1" aria-labelledby="home-tab">
							<div class="table-responsive">
								<table class="table">
									<tbody>
										<tr>
											<th style="width: 50%">Institution's Name:</th>
											<td id="institutionNametdid"></td>
										</tr>
										<tr>
											<th>Founded On:</th>
											<td id="insDateOfInceptiontdid"></td>
										</tr>
										<tr>
											<th>Address:</th>
											<td id="insAddressLine1tdid"></td>
										</tr>
										<tr>
											<th>Country:</th>
											<td id="insCountrytdid"></td>
										</tr>
										<tr>
											<th>State:</th>
											<td id="insStatetdid"></td>
										</tr>
										<tr>
											<th>City:</th>
											<td id="insCitytdid"></td>
										</tr>
										<tr>
											<th>Pincode:</th>
											<td id="insPinCodetdid"></td>
										</tr>
										<tr>
											<th>Institution's Registration Code:</th>
											<td id="institutionRegistraionCodetdid"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div role="tabpanel" class="tab-pane fade" id="tab_content2"
							aria-labelledby="profile-tab">
							<div class="table-responsive">
								<table class="table">
									<tbody>
										<tr>
											<th style="width: 50%">Phone:</th>
											<td id="insPhonetdid"></td>
										</tr>
										<tr>
											<th>Alternate Phone:</th>
											<td id="insAltPhonetdid"></td>
										</tr>
										<tr>
											<th>Email:</th>
											<td id="insEmailtdid"></td>
										</tr>
										<tr>
											<th>Fax:</th>
											<td id="insFaxtdid"></td>
										</tr>
										<tr>
											<th>Institute Website URL:</th>
											<td id="insWebsiteUrltdid"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div role="tabpanel" class="tab-pane fade" id="tab_content3"
							aria-labelledby="profile-tab">
							<div class="table-responsive">
								<table class="table">
									<tbody>
										<tr>
											<th style="width: 50%">Name of the Principal/Head:</th>
											<td id="insHeadNametdid"></td>
										</tr>
										<tr>
											<th>Email of the Principal/Head:</th>
											<td id="insHeadEmailIdtdid"></td>
										</tr>
										<tr>
											<th>Office no of Principal/Head:</th>
											<td id="insHeadOfficeNotdid"></td>
										</tr>
										<tr>
											<th>Personal no of Principal/Head:</th>
											<td id="insHeadPersonalNotdid"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div role="tabpanel" class="tab-pane fade" id="tab_content4"
							aria-labelledby="profile-tab">
							<div class="table-responsive">
								<table class="table">
									<tbody>
										<tr>
											<th style="width: 50%">Institution Type:</th>
											<td id="insTypetdid"></td>
										</tr>
										<tr>
											<th>Parent Institution:</th>
											<td id="insParentIdtdid"></td>
										</tr>
										<tr>
											<th>Medium Of Education:</th>
											<td id="insMediumOfEducationtdid"></td>
										</tr>
										<tr>
											<th>School Board:</th>
											<td id="insBoardtdid"></td>
										</tr>
										<tr>
											<th>Institution's Examination Code:</th>
											<td id="insExaminationCodetdid"></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-primary" id="insSetupModal1Id">Save changes</button>
			</div>

		</div>
	</div>
</div>

<%@ include file="../common/footer.jsp"%>

<script>
	$(document)
			.ready(
					function() {
						$('#insDateOfInception')
								.daterangepicker(
										{
											singleDatePicker : true,
											calender_style : "picker_1"
										},
										function(start, end, label) {
											try {
												//to delete alert when user select dt from cal
												var prnt = document
														.getElementById("insDateOfInception").parentElement;
												var deletedElement = prnt.nextSibling.nextSibling;
												prnt.parentElement
														.removeChild(deletedElement);
											} catch (err) {

											}
										});

						$(":input").inputmask();

						$('#wizard').smartWizard();

						$('#wizard_verticle').smartWizard({
							transitionEffect : 'slide'
						});

						$('.buttonNext').addClass('btn btn-success');
						$('.buttonPrevious').addClass('btn btn-primary');
						$('.buttonFinish').addClass('btn btn-default');

						// Select2 -->
						$(".select2_single").select2({
							placeholder : "Select an option",
							allowClear : true
						});
						$(".select2_group").select2({});
						$(".select2_multiple").select2({
							maximumSelectionLength : 2,
							placeholder : "Max Selection 2",
							allowClear : true
						});
						
						// /Select2 -->
					});
	// validator 
	// initialize the validator function
	validator.message.date = 'not a real date';

	// validate a field on "blur" event, a 'select' on 'change' event & a '.reuired' classed multifield on 'keyup':
	$('form').on('blur', 'input[required], input.optional, select.required',
			validator.checkField).on('change', 'select.required',
			validator.checkField).on('keypress', 'input[required][pattern]',
			validator.keypress);

	$('.multi.required').on('keyup blur', 'input', function() {
		validator.checkField.apply($(this).siblings().last()[0]);
	});
	///validator end

	//this has been modified here because after multiple select when user backspace then page is getting refreshed
	//the function is called in select2.full.js
	function select2SrchFldKyDwnAction() {
		var evt = window.event;
		evt.stopPropagation();
		var key = evt.which;
		if (key === 8) {
			return false;
		}
	}

	function finishWizard(frmObj) {
		var submit = true;

		// evaluate the form using generic validaing
		if (!validator.checkAll(frmObj)) {
			submit = false;
		}

		if (submit) {
			document.getElementById("institutionNametdid").innerText=document.getElementById("institutionName").value;
			document.getElementById("insDateOfInceptiontdid").innerText=document.getElementById("insDateOfInception").value;
			document.getElementById("insAddressLine1tdid").innerText=document.getElementById("insAddressLine1").value;
			document.getElementById("insCountrytdid").innerText=document.getElementById("insCountry").value;
			document.getElementById("insStatetdid").innerText=document.getElementById("insState").value;
			document.getElementById("insCitytdid").innerText=document.getElementById("insCity").value;
			document.getElementById("insPinCodetdid").innerText=document.getElementById("insPinCode").value;
			document.getElementById("institutionRegistraionCodetdid").innerText=document.getElementById("institutionRegistraionCode").value;
			document.getElementById("insPhonetdid").innerText=document.getElementById("insPhone").value;
			document.getElementById("insAltPhonetdid").innerText=document.getElementById("insAltPhone").value;
			document.getElementById("insEmailtdid").innerText=document.getElementById("insEmail").value;
			document.getElementById("insFaxtdid").innerText=document.getElementById("insFax").value;
			document.getElementById("insWebsiteUrltdid").innerText=document.getElementById("insWebsiteUrl").value;
			document.getElementById("insHeadNametdid").innerText=document.getElementById("insHeadName").value;
			document.getElementById("insHeadEmailIdtdid").innerText=document.getElementById("insHeadEmailId").value;
			document.getElementById("insHeadOfficeNotdid").innerText=document.getElementById("insHeadOfficeNo").value;
			document.getElementById("insHeadPersonalNotdid").innerText=document.getElementById("insHeadPersonalNo").value;
			document.getElementById("insTypetdid").innerText=document.querySelector('input[name="insType"]:checked').value
			document.getElementById("insParentIdtdid").innerText=document.getElementById("insParentName").value;
			var select=document.getElementById("insMediumOfEducation");
			var result = [];
			  var options = select && select.options;
			  var opt;

			  for (var i=0, iLen=options.length; i<iLen; i++) {
			    opt = options[i];

			    if (opt.selected) {
			      result.push(opt.value || opt.text);
			    }
			  }

			document.getElementById("insMediumOfEducationtdid").innerText=result;
			document.getElementById("insBoardtdid").innerText=document.getElementById("insBoard").value;
			document.getElementById("insExaminationCodetdid").innerText=document.getElementById("insExaminationCode").value;
			document.getElementById("insSetupModal1Id").onclick = function() {submitInsCreate(frmObj)};

			$(".bs-example-modal-lg").modal();
			
		}

		return false;
	}
	
	function submitInsCreate(frmObj){
		$.ajax({
			type: frmObj.attr('method'),
            url: frmObj.attr('action'),
            data: frmObj.serialize(),
            dataType: 'json',
	        success: function (response) {
	        	if(response.successMsg){
	        		$("#instituteModalId .close").click();
	        		swal("", response.successMsg, "success"); 
	        	}	
	        	if(response.errMsg)
	        		swal("", response.errMsg, "error"); 
	        	
	        }
	    });
	}
</script>