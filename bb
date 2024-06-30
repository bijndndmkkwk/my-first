<?php
  // Get the user's email and message from the form
  $email = $_POST['email'];
  $message = $_POST['message'];

  // Send the email
  $to = $email;
  $subject = "Your Message";
  $headers = "From: my-email@example.com";
  $body = "Here's your message: $message";
  if (mail($to, $subject, $body, $headers)) {
    echo "Message sent successfully!";
  } else {
    echo "Error sending message.";
  }
?>
