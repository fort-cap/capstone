const client = filestack.init(apiKey);
const options = {
    onUploadDone: updateForm,
    displayMode: 'dropPane',
    dropPane: {
        overlay: false
    },
    customText: {
        'Drag and Drop, Copy and Paste Files': 'Click the \'+\' file icon above, drag and drop, or copy and paste to upload'
    },
    container: '#fs-upload',
    maxSize: 250 * 1024 * 1024, // 250MB max
    accept: ['image/*', 'video/*'],
    uploadInBackground: false,
    startUploadingWhenMaxFilesReached: true,
    storeTo: {
        workflows: ["1d91169c-19b3-4114-8047-c49cfe9d8535"]
    }
};
// const picker = client.picker(options);
client.picker(options).open();

// Get references to the DOM elements
// const form = document.getElementById('pick-form');
// const fileInput = document.getElementById('fileupload');
// const btn = document.getElementById('picker');

const btn = document.getElementById('fs-upload');

// const nameBox = document.getElementById('nameBox');

// Add our event listeners
// btn.addEventListener('click', function (e) {
//     e.preventDefault();
//     picker.open();
// });
// form.addEventListener('submit', function (e) {
//     e.preventDefault();
//     alert('Submitting: ' + fileInput.value);
// });

// Helper to overwrite the field input value
function updateForm(result) {
    // const fileData = result.filesUploaded[0];
    // const urlBox = document.getElementById('urlBox').children[0].text;
    // console.log(urlBox);
    // fileInput.value = fileData.url;

    // Some ugly DOM code to show some data.

    // const name = document.createTextNode('Selected: ' + fileData.filename);
    // const url = document.createElement('a');
    // url.href = fileData.url;
    // url.appendChild(document.createTextNode(fileData.url));
    // document.getElementById("profileImageUrl").value = fileData.url;
    document.getElementById("video-url").value = '<video src="' + result.filesUploaded[0].url  + '" controls>Your browser does not support HTML video.</video>';

    // nameBox.appendChild(name);
    // urlBox.appendChild(document.createTextNode('Uploaded to: '));
    // urlBox.appendChild(url);
    // console.log(result);
    // var one = document.getElementById("urlBox").children[0].href;
    // console.log(one)
}

// function pickMark() {
//     // console.log("Uploading Photo");
//     // //Opening the file picker here
//     // client.picker({
//     //     accept: 'image/*',
//     //     maxFiles:1
//     // }).then(function(result) {
//     //     console.log("File url: " + result.filesUploaded[0].url);
//     //     console.log(pickWatermark);
//
//     var one = document.getElementById("urlBox").children[0].href;
//         console.log(one)
//     // });
// }