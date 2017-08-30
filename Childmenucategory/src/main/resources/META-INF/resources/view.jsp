<%@ include file="/init.jsp" %>
<!--  <script src="http://cdn.alloyui.com/2.5.0/aui/aui-min.js"></script>
<link href="http://cdn.alloyui.com/2.5.0/aui-css/css/bootstrap.min.css" rel="stylesheet"></link>


<!-bill upload->
<portlet:defineObjects />
<portlet:actionURL var="insert" name="insert"></portlet:actionURL>
<aui:form method="post" >

<p>
<aui:input label="BILL TYPE:" name="billtype" type="text" value='<%= " " %>'>
<aui:validator name="required" />
</aui:input>
</p>

<p>
<aui:input label="Number Of Participants:" type="text" name="mobile" value='<%= "" %>' >
<aui:validator name="required" />
<aui:validator name="number"/> 
</aui:input>
<p>

<p>
<button class="btn btn-primary"><i class="icon-calendar icon-white"></i> Select the date</button>
</p>


<p>
<fieldset>
        <legend><span>Name Of Participants</span></legend>
        <div class="field-group">
            <label for="textarea-id">Name Of Participants</label>
            <textarea class="textarea" name="participants" id="participants" placeholder=" "></textarea>
        </div>
    </fieldset>
</p>
<br>

<p>
<fieldset>
        <legend><span>Bill Description</span></legend>
        <div class="field-group">
            <label for="textarea-id">Description</label>
            <textarea class="textarea" name="desc" id="desc" placeholder=" "></textarea>
        </div>
    </fieldset>
</p>

<p>
<aui:input label="Bill Amount:" type="text" name="amount" value='<%= "" %>' >
<aui:validator name="required" />
<aui:validator name="number"/> 
</aui:input>
<p>

<p>
<aui:input label="Max Allowed Bill Amount:" value="Rs 5000" name="max"> 
</aui:input>
<p>

<p>
<fieldset>
        <legend><span>File upload</span></legend>
        <div class="field-group">
            <label for="file-upload-example">Upload
                file</label>
            <input class="upfile" type="file" id="file-upload-example" name="file-upload-example">
        </div>
    </fieldset>
</p>


<p class="button">
<aui:button type="submit" value="SUBMIT" style="color:black ; background-color:blue"></aui:button>
</aui:form>

<script>
YUI().use(
    'aui-datepicker',
    function(Y) {
      new Y.DatePicker(
        {
          trigger: 'button',
          popover: {
            zIndex: 1
          },
          on: {
            selectionChange: function(event) {
              console.log(event.newSelection)
            }
          }
        }
      );
    }
  );
</script>-->

this is a sample test