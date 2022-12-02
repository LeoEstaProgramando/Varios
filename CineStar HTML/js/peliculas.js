const id = (new URLSearchParams(window.location.search)).get('id');

//if (id != 'cartelera' || id != 'estrenos') {
//    window.location.href = "index.html";
//}

const getPeliculas = async() => {
    const data = await fetch(`https://webcinestar001.000webhostapp.com/cinestar_sweb/peliculas/${id}`);
    if (data.status == 200) {
        const peliculas = await data.json();
        let peliculasHTML = `<br><h1>Cartelera</h1><br>`;
        peliculas.forEach(pelicula => {
            peliculasHTML += `                
                <div class="contenido-pelicula">
                    <div class="datos-pelicula">
                        <h2>${pelicula.Titulo}</h2><br>
                        <p>${pelicula.Sinopsis}</p>
                        <br>
                        <div class="boton-pelicula"> 
                            <a href="pelicula.html?id=${pelicula.id}" >
                                <img src="img/varios/btn-mas-info.jpg" width="120" height="30" alt="Ver info">
                            </a>
                        </div>
                        <div class="boton-pelicula"> 
                            <a href="http://www.cinestar.com.pe/popups/trailer/v3fspveODBI" onclick="return hs.htmlExpand(this, { objectType: 'iframe' } )" >
                                <img src="img/varios/btn-trailer.jpg" width="120" height="30" alt="Ver trailer">
                            </a>
                        </div> 
                    </div>
                    <img src="img/pelicula/${pelicula.id}.jpg" width="160" height="226"><br><br>
                </div>`
        }); 






        document.getElementById("contenido-interno").innerHTML = peliculasHTML;
    }
}

getPeliculas();