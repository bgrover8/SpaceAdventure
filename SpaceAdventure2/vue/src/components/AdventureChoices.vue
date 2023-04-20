<template>
  <div class="main">
    <section class="dialogue">
      <h1>The year is AfterColony 455.</h1>
            <h2>The star system is restless.</h2>
            <h2>You are in your mining spacecraft.</h2>
            <img src="../assets/Spaceship.png" alt="A mining spaceship.">
      
    </section>
    <section class="choices">
      <p>You are located at: </p>
      <p>What do you do?</p>
      <button v-on:click.prevent="" >Mine nearby resources to sell</button>
      <button v-on:click.prevent="" >Travel to a nearby location</button>
      <button v-on:click.prevent="" >Enter shop</button>
      <button v-on:click.prevent="" >Check status</button>
      <button v-on:click.prevent="" >Quit game</button>

    
    
    </section>
  </div>
</template>

<script>
export default {
    data(){

    },
    method: {

    }

}
</script>

<style scope>
.main {
  color: whitesmoke;
  font-family:Arial, Helvetica, sans-serif;

}

.dialogue {
  margin: 20px 0 5px 0;
  font-size: medium;
  font-family:Arial, Helvetica, sans-serif;
  

}
.dialogue h1 {
    font-family:Arial, Helvetica, sans-serif;
    background-color: rgb(0, 0, 0, .25);
    width: 80%;
    margin: 10px auto;
}
.dialogue h2 {
    font-family:Arial, Helvetica, sans-serif;
    background-color: rgb(0, 0, 0, .25);
    width: 80%;
    margin: 10px auto;

}
.dialogue img {
  width: 70%;
}

.choices {
  width: 70%;
  margin: 5px auto;
  color: whitesmoke;
  background-color:transparent;
}

.choices p {
  padding: 10px;
  background-color: rgb(0, 0, 0, .35);
  margin: 4px;

}
.choices button {
  font-family:Arial, Helvetica, sans-serif;
  margin: 5px auto;
  width: 100%;
  font-size: large;
  padding: 5px;
  color: rgb(44, 44, 44);
  border-radius: 5px;
  border-width: 3px;
  border-color: whitesmoke;
  color: whitesmoke;
  /* background-color: transparent; */
  background-color: rgb(0, 0, 0, .25);
  
}

@media screen and (max-width: 768px) {
.dialogue img {
  width: 80%;
}
}

</style>